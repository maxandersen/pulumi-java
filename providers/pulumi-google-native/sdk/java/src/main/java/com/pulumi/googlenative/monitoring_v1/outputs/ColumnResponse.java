// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.monitoring_v1.outputs.WidgetResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ColumnResponse {
    /**
     * The relative weight of this column. The column weight is used to adjust the width of columns on the screen (relative to peers). Greater the weight, greater the width of the column on the screen. If omitted, a value of 1 is used while rendering.
     * 
     */
    private final String weight;
    /**
     * The display widgets arranged vertically in this column.
     * 
     */
    private final List<WidgetResponse> widgets;

    @CustomType.Constructor
    private ColumnResponse(
        @CustomType.Parameter("weight") String weight,
        @CustomType.Parameter("widgets") List<WidgetResponse> widgets) {
        this.weight = weight;
        this.widgets = widgets;
    }

    /**
     * The relative weight of this column. The column weight is used to adjust the width of columns on the screen (relative to peers). Greater the weight, greater the width of the column on the screen. If omitted, a value of 1 is used while rendering.
     * 
    */
    public String weight() {
        return this.weight;
    }
    /**
     * The display widgets arranged vertically in this column.
     * 
    */
    public List<WidgetResponse> widgets() {
        return this.widgets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ColumnResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String weight;
        private List<WidgetResponse> widgets;

        public Builder() {
    	      // Empty
        }

        public Builder(ColumnResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.weight = defaults.weight;
    	      this.widgets = defaults.widgets;
        }

        public Builder weight(String weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }
        public Builder widgets(List<WidgetResponse> widgets) {
            this.widgets = Objects.requireNonNull(widgets);
            return this;
        }
        public Builder widgets(WidgetResponse... widgets) {
            return widgets(List.of(widgets));
        }        public ColumnResponse build() {
            return new ColumnResponse(weight, widgets);
        }
    }
}
