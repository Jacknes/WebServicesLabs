<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : cd.xsl
    Created on : 20 April 2017, 12:50 PM
    Author     : 12545404
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/">
        <html>
            <head>
                <style>
                    .artist { font-style: italic; margin-bottom: 20px; }
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
        <div class="artist">By <xsl:apply-templates/></div>
    </xsl:template>
    
    <xsl:template match="tracklist">
        <table>
            <thead>
                <tr><th>Title</th><th>Time</th><th>Rating</th></tr>
            </thead>
            <tbody>
                <xsl:apply-templates/>
            </tbody>
        </table>
    </xsl:template>
    
    <xsl:template match="track">
        <tr><xsl:apply-templates/></tr>
    </xsl:template>
    
    <xsl:template match="track/title | time | rating">
        <td><xsl:apply-templates/></td>
    </xsl:template>
    
</xsl:stylesheet>