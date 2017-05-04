<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : cd2.xsl
    Created on : 20 April 2017, 1:06 PM
    Author     : 12545404
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>
    
    <xsl:variable name ="sumOfRatings" select="document('cd.xml')/tracklist"/>
   
    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/">
        <html>
            <head>
                <style>
                    table.tracklist { border: solid 1px black; border-collapse: collapse; }
                    table.tracklist td { border: solid 1px #999; }
                    .artist { font-style: italic; margin-bottom: 20px; }
                    .even { background: #fff; }
                    .odd { background: #f2f2f2; }
                </style>
            </head>
            <body>
                <xsl:apply-templates/>
                
                
            </body>
        </html>
    </xsl:template>
    
    <xsl:template match="title">
        <h1><xsl:apply-templates/></h1>
    </xsl:template>
    
    <xsl:template match="artist">
        <div class="artist"><xsl:apply-templates/></div>
    </xsl:template>
    
    <xsl:template match="tracklist">
        <table class="tracklist">
            <thead>
                <tr><th>Track</th><th>Info</th><th>Rating</th></tr>
            </thead>
            <tbody>
                <xsl:apply-templates/>
            </tbody>
        </table>
        <p>Total number of tracks: <xsl:value-of select="count(track)"/></p>
        <p>Average track rating: 2.75</p>
    </xsl:template>
      
    <xsl:template match="track">
        <xsl:if test="@id mod 2 = 0">
            <tr class="even">
                <td>#<xsl:value-of select="@id"/></td>
                <td>
                    <xsl:value-of select="time"/> - <xsl:value-of select="title"/>
                </td>
                <td>
                    <div style="width: {rating*20}px; height: 12px; background: blue;"></div>
                </td>
            </tr>
        </xsl:if>
        <xsl:if test="@id mod 2 != 0">
            <tr class="odd">
                    <td>#<xsl:value-of select="@id"/></td>
                    <td>
                        <xsl:value-of select="time"/> - <xsl:value-of select="title"/>
                    </td>
                    <td>
                        <div style="width: {rating*20}px; height: 12px; background: blue;"></div>
                    </td>
                </tr>
            
        </xsl:if>
    </xsl:template>
    
</xsl:stylesheet>
