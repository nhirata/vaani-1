/**
 * Copyright (c) 2014-2015 openHAB UG (haftungsbeschraenkt) and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package io.vaani.ui.vaaniui.internal;

import org.openhab.ui.dashboard.DashboardTile;

/**
 * The dashboard tile for the Vaani UI
 * 
 * @author Kelly Davis
 *
 */
public class VaaniUIDashboardTile implements DashboardTile {

    @Override
    public String getName() {
        return "Vaani UI";
    }

    @Override
    public String getUrl() {
        return "../ui/index.html";
    }

    @Override
    public String getOverlay() {
        return "html5";
    }

    @Override
    public String getImageUrl() {
        return "../ui/img/dashboardtile.png";
    }
}
