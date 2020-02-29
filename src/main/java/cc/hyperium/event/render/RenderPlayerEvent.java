/*
 *       Copyright (C) 2018-present Hyperium <https://hyperium.cc/>
 *
 *       This program is free software: you can redistribute it and/or modify
 *       it under the terms of the GNU Lesser General Public License as published
 *       by the Free Software Foundation, either version 3 of the License, or
 *       (at your option) any later version.
 *
 *       This program is distributed in the hope that it will be useful,
 *       but WITHOUT ANY WARRANTY; without even the implied warranty of
 *       MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *       GNU Lesser General Public License for more details.
 *
 *       You should have received a copy of the GNU Lesser General Public License
 *       along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package cc.hyperium.event.render;

import cc.hyperium.event.Event;
import com.google.common.base.Preconditions;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.entity.RenderManager;
import org.jetbrains.annotations.NotNull;

/**
 * Invoked when a player model is rendered
 */
public final class RenderPlayerEvent extends Event {

  @NotNull
  private final AbstractClientPlayer entity;
  @NotNull
  private final RenderManager renderManager;

  private final double x;
  private final double y;
  private final double z;

  private final float partialTicks;

  public RenderPlayerEvent(@NotNull AbstractClientPlayer entity,
      @NotNull RenderManager renderManager, double x, double y, double z, float partialTicks) {
    Preconditions.checkNotNull(entity, "entity");
    Preconditions.checkNotNull(renderManager, "renderManager");

    this.entity = entity;
    this.renderManager = renderManager;
    this.x = x;
    this.y = y;
    this.z = z;
    this.partialTicks = partialTicks;
  }

  @NotNull
  public final AbstractClientPlayer getEntity() {
    return entity;
  }

  @NotNull
  public final RenderManager getRenderManager() {
    return renderManager;
  }

  public final double getX() {
    return x;
  }

  public final double getY() {
    return y;
  }

  public final double getZ() {
    return z;
  }

  public final float getPartialTicks() {
    return partialTicks;
  }
}
