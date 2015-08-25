package com.bloc.objects;

class Song extends Object {
	// The ensemble which produced it
	Ensemble mEnsemble;
	// Title of the song
	String mTitle;
	// The year it was released
	int mYearReleased;
        
	/*
	 * Song
	 *
	 * Default Constructor
	 * Side-effects: Assigns some default ensemble, title and
	 *				 and year of your choosing
	 */
        
        public Song() {
            
            Artist defArtist = new Artist("<not set>", "<not set>");
            Artist[] defGroup = {defArtist};
            
            mEnsemble = new Ensemble(defGroup);
            mTitle = "<not set>";
            mYearReleased = 0;
             
        }
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the first Song constructor
	/************************************************/

	/*
	 * Song
	 *
	 * Side-effects: Sets the year of release to 0
	 *
	 * @param ensemble the ensemble responsible (Ensemble)
	 * @param title the song title (String)
	 */
        
        public Song(Ensemble ensemble, String title){
            mEnsemble = ensemble;
            mTitle = title;
            mYearReleased = 0;
        }
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the second Song constructor
	/************************************************/

	/*
	 * Song
	 *
	 * @param ensemble the ensemble responsible (Ensemble)
	 * @param title the song title (String)
	 * @param yearReleased the year the song was released (int)
	 */
        
        public Song(Ensemble ensemble, String title, int yearReleased){
            mEnsemble = ensemble;
            mTitle = title;
            mYearReleased = yearReleased;
        }
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the third Song constructor
	/************************************************/
}