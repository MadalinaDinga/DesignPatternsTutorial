package com.company.factory;

import com.company.factory.pages.AboutPage;
import com.company.factory.pages.CommentPage;
import com.company.factory.pages.ContactPage;
import com.company.factory.pages.PostPage;

/**
 * Created by Madalina Dinga on 13.12.2017.
 */
public class Blog extends Website {

    @Override
    public void createWebsite(){
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new ContactPage());
        pages.add(new CommentPage());
    }


}
