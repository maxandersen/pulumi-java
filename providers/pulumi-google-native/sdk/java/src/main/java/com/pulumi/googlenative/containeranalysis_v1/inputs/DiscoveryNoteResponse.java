// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A note that indicates a type of analysis a provider would perform. This note exists in a provider&#39;s project. A `Discovery` occurrence is created in a consumer&#39;s project at the start of analysis.
 * 
 */
public final class DiscoveryNoteResponse extends com.pulumi.resources.InvokeArgs {

    public static final DiscoveryNoteResponse Empty = new DiscoveryNoteResponse();

    /**
     * Immutable. The kind of analysis that is handled by this discovery.
     * 
     */
    @Import(name="analysisKind", required=true)
      private final String analysisKind;

    public String analysisKind() {
        return this.analysisKind;
    }

    public DiscoveryNoteResponse(String analysisKind) {
        this.analysisKind = Objects.requireNonNull(analysisKind, "expected parameter 'analysisKind' to be non-null");
    }

    private DiscoveryNoteResponse() {
        this.analysisKind = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiscoveryNoteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String analysisKind;

        public Builder() {
    	      // Empty
        }

        public Builder(DiscoveryNoteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analysisKind = defaults.analysisKind;
        }

        public Builder analysisKind(String analysisKind) {
            this.analysisKind = Objects.requireNonNull(analysisKind);
            return this;
        }        public DiscoveryNoteResponse build() {
            return new DiscoveryNoteResponse(analysisKind);
        }
    }
}
