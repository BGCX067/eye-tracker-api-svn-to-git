/*
 * Copyright (C) 2012 United States Government as represented by the Administrator of the
 * National Aeronautics and Space Administration.
 * All Rights Reserved.
 */

package gov.nasa.worldwind.ogc.collada;

import gov.nasa.worldwind.ogc.collada.impl.*;
import gov.nasa.worldwind.render.DrawContext;

/**
 * Represents the COLLADA <i>instance_node</i> element and provides access to its contents.
 *
 * @author pabercrombie
 * @version $Id: ColladaInstanceNode.java 654 2012-06-25 04:15:52Z pabercrombie $
 */
public class ColladaInstanceNode extends ColladaAbstractInstance<ColladaNode> implements ColladaRenderable
{
    /**
     * Construct an instance.
     *
     * @param ns the qualifying namespace URI. May be null to indicate no namespace qualification.
     */
    public ColladaInstanceNode(String ns)
    {
        super(ns);
    }

    /** {@inheritDoc} Renders the target of the instance pointer, if the target can be resolved. */
    public void preRender(ColladaTraversalContext tc, DrawContext dc)
    {
        ColladaNode instance = this.get();
        if (instance != null)
            instance.preRender(tc, dc);
    }

    /** {@inheritDoc} Renders the target of the instance pointer, if the target can be resolved. */
    public void render(ColladaTraversalContext tc, DrawContext dc)
    {
        ColladaNode instance = this.get();
        if (instance != null)
            instance.render(tc, dc);
    }
}