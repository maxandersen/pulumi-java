// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gameservices_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * The label selector, used to group labels on the resources.
 * 
 */
public final class LabelSelectorResponse extends com.pulumi.resources.InvokeArgs {

    public static final LabelSelectorResponse Empty = new LabelSelectorResponse();

    /**
     * Resource labels for this selector.
     * 
     */
    @Import(name="labels", required=true)
    private Map<String,String> labels;

    public Map<String,String> labels() {
        return this.labels;
    }

    private LabelSelectorResponse() {}

    private LabelSelectorResponse(LabelSelectorResponse $) {
        this.labels = $.labels;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LabelSelectorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LabelSelectorResponse $;

        public Builder() {
            $ = new LabelSelectorResponse();
        }

        public Builder(LabelSelectorResponse defaults) {
            $ = new LabelSelectorResponse(Objects.requireNonNull(defaults));
        }

        public Builder labels(Map<String,String> labels) {
            $.labels = labels;
            return this;
        }

        public LabelSelectorResponse build() {
            $.labels = Objects.requireNonNull($.labels, "expected parameter 'labels' to be non-null");
            return $;
        }
    }

}
