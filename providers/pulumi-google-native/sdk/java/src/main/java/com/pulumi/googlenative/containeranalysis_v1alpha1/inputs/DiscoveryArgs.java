// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.containeranalysis_v1alpha1.enums.DiscoveryAnalysisKind;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A note that indicates a type of analysis a provider would perform. This note exists in a provider's project. A `Discovery` occurrence is created in a consumer's project at the start of analysis. The occurrence's operation will indicate the status of the analysis. Absence of an occurrence linked to this note for a resource indicates that analysis hasn't started.
 * 
 */
public final class DiscoveryArgs extends com.pulumi.resources.ResourceArgs {

    public static final DiscoveryArgs Empty = new DiscoveryArgs();

    /**
     * The kind of analysis that is handled by this discovery.
     * 
     */
    @Import(name="analysisKind")
      private final @Nullable Output<DiscoveryAnalysisKind> analysisKind;

    public Output<DiscoveryAnalysisKind> analysisKind() {
        return this.analysisKind == null ? Codegen.empty() : this.analysisKind;
    }

    public DiscoveryArgs(@Nullable Output<DiscoveryAnalysisKind> analysisKind) {
        this.analysisKind = analysisKind;
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
        private @Nullable Output<DiscoveryAnalysisKind> analysisKind;

        public Builder() {
    	      // Empty
        }

        public Builder(DiscoveryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analysisKind = defaults.analysisKind;
        }

        public Builder analysisKind(@Nullable Output<DiscoveryAnalysisKind> analysisKind) {
            this.analysisKind = analysisKind;
            return this;
        }
        public Builder analysisKind(@Nullable DiscoveryAnalysisKind analysisKind) {
            this.analysisKind = Codegen.ofNullable(analysisKind);
            return this;
        }        public DiscoveryArgs build() {
            return new DiscoveryArgs(analysisKind);
        }
    }
}
