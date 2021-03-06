/*
 * Copyright (c) 2018, Tomas Slusny <slusnucky@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.motherloadmine;

import net.runelite.client.config.*;


@ConfigGroup("Motherload mine config")
public interface MotherloadMineConfig extends Config
{
	@ConfigTitleSection(
			keyName = "firstTitle",
			name = "Motherload Config",
			description = "",
			position = 1
	)
	default Title firstTitle()
	{
		return new Title();
	}

	@ConfigItem(
			keyName = "showOverlay",
			name = "Show Overlay",
			description = "Show Overlay?",
			position = 2
	)
	default boolean showOverlay() { return false; }

	@ConfigItem(
			keyName = "toggleKey",
			name = "Toggle Key",
			description = "Key to toggle on / off",
			position = 3
	)
	default Keybind toggleKey()
	{
		return Keybind.NOT_SET;
	}

	enum OptionEnum
	{
		BOTTOMLEVEL,
		UPPERLEVEL
	}
	@ConfigItem(
			position = 4,
			keyName = "floorSelect",
			name = "Which floor",
			description = "Select which level/floor you want to bot in"
	)
	default OptionEnum floorSelect() { return OptionEnum.BOTTOMLEVEL; }
}