@regression @smoke @us-246
Feature: Target Brand Outline

Description: User should able to filter items by Brand

	Background: 
		Given Open Target Homepage
	
	Scenario Outline: Filter items by Brand
		Given Search for "<Items>"
		When Filter by "<Brand>"
		Then Item list should have products of "<Brand>"
	
	Examples:
		|Items		|Brand		|
		|Shoes		|Batman		|                            
		|Shirts		|ASICS		|
		|Pants		|AVENUE		|