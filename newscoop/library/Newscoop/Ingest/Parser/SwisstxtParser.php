<?php
/**
 * @package Newscoop
 * @copyright 2012 Sourcefabric o.p.s.
 * @license http://www.gnu.org/licenses/gpl-3.0.txt
 */

namespace Newscoop\Ingest\Parser;

use Newscoop\Ingest\Parser;

/**
 * Swissinfo parser
 */
class SwisstxtParser implements Parser
{

    /** @var SimpleXMLElement */
    private $story;

    /** @var DateTime */
    private $date;

    /**
     * @param string $content
     */
    public function __construct($content)
    {
        $this->story = simplexml_load_file($content);

        try {
            $date_string = $this->getString($this->story->xpath('MetaData/createdDate'));
            $this->date = new \DateTime($date_string);
        }
        catch (Exception $e) {
            $this->date = new \DateTime();
            //echo $e->getMessage();
        }
    }

    /**
     * Get title
     *
     * @return string
     */
    public function getTitle()
    {
        return $this->getString($this->story->xpath('Content/message/part/title'));
    }

    /**
     * Get content
     *
     * @return string
     */
    public function getContent()
    {
        $content = $this->getString($this->story->xpath('Content/message/part/body'));

        return $content;
    }

    /**
     * Get created
     *
     * @return DateTime
     */
    public function getCreated()
    {
        return $this->date;
    }


    /**
     * Get updated
     *
     * @return DateTime
     */
    public function getUpdated()
    {
        return $this->date;
    }

    /**
     * Get date id yyyymmdd
     *
     * @return string
     */
    public function getDateId()
    {
        return $this->date->format('Ymd');
    }

     /**
     * Get news item id
     *
     * @return string
     */
    public function getNewsItemId()
    {
        return $this->getString($this->story->xpath('MetaData/contentObjectId'));
    }

    public function getPriority()
    {
        return null;
    }

    /**
     * Get summary
     *
     * @return string
     */
    public function getSummary()
    {
        return '';
    }

    /**
     * Get status
     *
     * @return string
     */
    public function getStatus()
    {
        return $this->getString($this->story->xpath('MetaData/status'));
    }

    /**
     * Get lift embargo
     *
     * @return DateTime|null
     */
    public function getLiftEmbargo()
    {
        return null;
    }

    /**
     * Get service
     *
     * @return string
     */
    public function getService()
    {
        return 'swisstext';
    }

    public function getLanguage()
    {
        return $this->getString($this->story->xpath('MetaData/language'));
    }

    public function getSubject()
    {
        return "";
    }

    public function getCountry()
    {
        return "";
    }

    public function getProduct()
    {
        return "swisstext";
    }

    public function getSubtitle()
    {
        return "";
    }

    public function getProviderId()
    {
        return "";
    }

    public function getRevisionId()
    {
        return "";
    }

    public function getLocation()
    {
        return "";
    }

     public function getProvider()
    {
        return "swisstext";
    }

    public function getSource()
    {
        return "swisstext";
    }

    public function getCatchLine()
    {
        return "";
    }

    public function getCatchWord()
    {
        return "";
    }

    public function getAuthors()
    {
        return "";
    }

    public function getImages()
    {
        return null;
    }

    /**
     * Get string value of first matched element
     *
     * @param array $matches
     * @return string
     */
    private function getString(array $matches)
    {
        return (string) array_shift($matches);
    }
}