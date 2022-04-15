// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.monitoring_v1.inputs.WidgetArgs;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A single tile in the mosaic. The placement and size of the tile are configurable.
 * 
 */
public final class TileArgs extends io.pulumi.resources.ResourceArgs {

    public static final TileArgs Empty = new TileArgs();

    /**
     * The height of the tile, measured in grid blocks. Tiles must have a minimum height of 1.
     * 
     */
    @Import(name="height")
      private final @Nullable Output<Integer> height;

    public Output<Integer> height() {
        return this.height == null ? Codegen.empty() : this.height;
    }

    /**
     * The informational widget contained in the tile. For example an XyChart.
     * 
     */
    @Import(name="widget")
      private final @Nullable Output<WidgetArgs> widget;

    public Output<WidgetArgs> widget() {
        return this.widget == null ? Codegen.empty() : this.widget;
    }

    /**
     * The width of the tile, measured in grid blocks. Tiles must have a minimum width of 1.
     * 
     */
    @Import(name="width")
      private final @Nullable Output<Integer> width;

    public Output<Integer> width() {
        return this.width == null ? Codegen.empty() : this.width;
    }

    /**
     * The zero-indexed position of the tile in grid blocks relative to the left edge of the grid. Tiles must be contained within the specified number of columns. x_pos cannot be negative.
     * 
     */
    @Import(name="xPos")
      private final @Nullable Output<Integer> xPos;

    public Output<Integer> xPos() {
        return this.xPos == null ? Codegen.empty() : this.xPos;
    }

    /**
     * The zero-indexed position of the tile in grid blocks relative to the top edge of the grid. y_pos cannot be negative.
     * 
     */
    @Import(name="yPos")
      private final @Nullable Output<Integer> yPos;

    public Output<Integer> yPos() {
        return this.yPos == null ? Codegen.empty() : this.yPos;
    }

    public TileArgs(
        @Nullable Output<Integer> height,
        @Nullable Output<WidgetArgs> widget,
        @Nullable Output<Integer> width,
        @Nullable Output<Integer> xPos,
        @Nullable Output<Integer> yPos) {
        this.height = height;
        this.widget = widget;
        this.width = width;
        this.xPos = xPos;
        this.yPos = yPos;
    }

    private TileArgs() {
        this.height = Codegen.empty();
        this.widget = Codegen.empty();
        this.width = Codegen.empty();
        this.xPos = Codegen.empty();
        this.yPos = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> height;
        private @Nullable Output<WidgetArgs> widget;
        private @Nullable Output<Integer> width;
        private @Nullable Output<Integer> xPos;
        private @Nullable Output<Integer> yPos;

        public Builder() {
    	      // Empty
        }

        public Builder(TileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.height = defaults.height;
    	      this.widget = defaults.widget;
    	      this.width = defaults.width;
    	      this.xPos = defaults.xPos;
    	      this.yPos = defaults.yPos;
        }

        public Builder height(@Nullable Output<Integer> height) {
            this.height = height;
            return this;
        }
        public Builder height(@Nullable Integer height) {
            this.height = Codegen.ofNullable(height);
            return this;
        }
        public Builder widget(@Nullable Output<WidgetArgs> widget) {
            this.widget = widget;
            return this;
        }
        public Builder widget(@Nullable WidgetArgs widget) {
            this.widget = Codegen.ofNullable(widget);
            return this;
        }
        public Builder width(@Nullable Output<Integer> width) {
            this.width = width;
            return this;
        }
        public Builder width(@Nullable Integer width) {
            this.width = Codegen.ofNullable(width);
            return this;
        }
        public Builder xPos(@Nullable Output<Integer> xPos) {
            this.xPos = xPos;
            return this;
        }
        public Builder xPos(@Nullable Integer xPos) {
            this.xPos = Codegen.ofNullable(xPos);
            return this;
        }
        public Builder yPos(@Nullable Output<Integer> yPos) {
            this.yPos = yPos;
            return this;
        }
        public Builder yPos(@Nullable Integer yPos) {
            this.yPos = Codegen.ofNullable(yPos);
            return this;
        }        public TileArgs build() {
            return new TileArgs(height, widget, width, xPos, yPos);
        }
    }
}
