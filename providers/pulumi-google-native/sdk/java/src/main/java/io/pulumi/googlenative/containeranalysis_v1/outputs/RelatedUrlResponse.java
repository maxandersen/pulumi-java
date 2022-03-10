// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RelatedUrlResponse {
    /**
     * Label to describe usage of the URL.
     * 
     */
    private final String label;
    /**
     * Specific URL associated with the resource.
     * 
     */
    private final String url;

    @OutputCustomType.Constructor
    private RelatedUrlResponse(
        @OutputCustomType.Parameter("label") String label,
        @OutputCustomType.Parameter("url") String url) {
        this.label = label;
        this.url = url;
    }

    /**
     * Label to describe usage of the URL.
     * 
    */
    public String getLabel() {
        return this.label;
    }
    /**
     * Specific URL associated with the resource.
     * 
    */
    public String getUrl() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RelatedUrlResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String label;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(RelatedUrlResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.label = defaults.label;
    	      this.url = defaults.url;
        }

        public Builder setLabel(String label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public RelatedUrlResponse build() {
            return new RelatedUrlResponse(label, url);
        }
    }
}
