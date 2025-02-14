// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vertex.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeMonitoringConfigSnapshotAnalysisArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AiFeatureStoreEntityTypeMonitoringConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final AiFeatureStoreEntityTypeMonitoringConfigArgs Empty = new AiFeatureStoreEntityTypeMonitoringConfigArgs();

    /**
     * Configuration of how features in Featurestore are monitored.
     * Structure is documented below.
     * 
     */
    @Import(name="snapshotAnalysis")
    private @Nullable Output<AiFeatureStoreEntityTypeMonitoringConfigSnapshotAnalysisArgs> snapshotAnalysis;

    /**
     * @return Configuration of how features in Featurestore are monitored.
     * Structure is documented below.
     * 
     */
    public Optional<Output<AiFeatureStoreEntityTypeMonitoringConfigSnapshotAnalysisArgs>> snapshotAnalysis() {
        return Optional.ofNullable(this.snapshotAnalysis);
    }

    private AiFeatureStoreEntityTypeMonitoringConfigArgs() {}

    private AiFeatureStoreEntityTypeMonitoringConfigArgs(AiFeatureStoreEntityTypeMonitoringConfigArgs $) {
        this.snapshotAnalysis = $.snapshotAnalysis;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AiFeatureStoreEntityTypeMonitoringConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AiFeatureStoreEntityTypeMonitoringConfigArgs $;

        public Builder() {
            $ = new AiFeatureStoreEntityTypeMonitoringConfigArgs();
        }

        public Builder(AiFeatureStoreEntityTypeMonitoringConfigArgs defaults) {
            $ = new AiFeatureStoreEntityTypeMonitoringConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param snapshotAnalysis Configuration of how features in Featurestore are monitored.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder snapshotAnalysis(@Nullable Output<AiFeatureStoreEntityTypeMonitoringConfigSnapshotAnalysisArgs> snapshotAnalysis) {
            $.snapshotAnalysis = snapshotAnalysis;
            return this;
        }

        /**
         * @param snapshotAnalysis Configuration of how features in Featurestore are monitored.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder snapshotAnalysis(AiFeatureStoreEntityTypeMonitoringConfigSnapshotAnalysisArgs snapshotAnalysis) {
            return snapshotAnalysis(Output.of(snapshotAnalysis));
        }

        public AiFeatureStoreEntityTypeMonitoringConfigArgs build() {
            return $;
        }
    }

}
