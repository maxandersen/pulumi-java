// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.containeranalysis_v1beta1.enums.DiscoveryAnalysisKind;
import java.util.Objects;


/**
 * A note that indicates a type of analysis a provider would perform. This note exists in a provider's project. A `Discovery` occurrence is created in a consumer's project at the start of analysis.
 * 
 */
public final class DiscoveryArgs extends com.pulumi.resources.ResourceArgs {

    public static final DiscoveryArgs Empty = new DiscoveryArgs();

    /**
     * Immutable. The kind of analysis that is handled by this discovery.
     * 
     */
    @Import(name="analysisKind", required=true)
      private final Output<DiscoveryAnalysisKind> analysisKind;

    public Output<DiscoveryAnalysisKind> analysisKind() {
        return this.analysisKind;
    }

    public DiscoveryArgs(Output<DiscoveryAnalysisKind> analysisKind) {
        this.analysisKind = Objects.requireNonNull(analysisKind, "expected parameter 'analysisKind' to be non-null");
    }

    private DiscoveryArgs() {
        this.analysisKind = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiscoveryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<DiscoveryAnalysisKind> analysisKind;

        public Builder() {
    	      // Empty
        }

        public Builder(DiscoveryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analysisKind = defaults.analysisKind;
        }

        public Builder analysisKind(Output<DiscoveryAnalysisKind> analysisKind) {
            this.analysisKind = Objects.requireNonNull(analysisKind);
            return this;
        }
        public Builder analysisKind(DiscoveryAnalysisKind analysisKind) {
            this.analysisKind = Output.of(Objects.requireNonNull(analysisKind));
            return this;
        }        public DiscoveryArgs build() {
            return new DiscoveryArgs(analysisKind);
        }
    }
}
