// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents configuration of dataset used in a labeling job.
 * 
 */
public final class LabelingDatasetConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final LabelingDatasetConfigurationResponse Empty = new LabelingDatasetConfigurationResponse();

    /**
     * Name of the data asset to perform labeling.
     * 
     */
    @Import(name="assetName", required=true)
      private final String assetName;

    public String assetName() {
        return this.assetName;
    }

    /**
     * AML dataset version.
     * 
     */
    @Import(name="datasetVersion", required=true)
      private final String datasetVersion;

    public String datasetVersion() {
        return this.datasetVersion;
    }

    /**
     * Indicates whether to enable incremental dataset refresh.
     * 
     */
    @Import(name="enableIncrementalDatasetRefresh")
      private final @Nullable Boolean enableIncrementalDatasetRefresh;

    public Optional<Boolean> enableIncrementalDatasetRefresh() {
        return this.enableIncrementalDatasetRefresh == null ? Optional.empty() : Optional.ofNullable(this.enableIncrementalDatasetRefresh);
    }

    public LabelingDatasetConfigurationResponse(
        String assetName,
        String datasetVersion,
        @Nullable Boolean enableIncrementalDatasetRefresh) {
        this.assetName = Objects.requireNonNull(assetName, "expected parameter 'assetName' to be non-null");
        this.datasetVersion = Objects.requireNonNull(datasetVersion, "expected parameter 'datasetVersion' to be non-null");
        this.enableIncrementalDatasetRefresh = enableIncrementalDatasetRefresh;
    }

    private LabelingDatasetConfigurationResponse() {
        this.assetName = null;
        this.datasetVersion = null;
        this.enableIncrementalDatasetRefresh = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabelingDatasetConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String assetName;
        private String datasetVersion;
        private @Nullable Boolean enableIncrementalDatasetRefresh;

        public Builder() {
    	      // Empty
        }

        public Builder(LabelingDatasetConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assetName = defaults.assetName;
    	      this.datasetVersion = defaults.datasetVersion;
    	      this.enableIncrementalDatasetRefresh = defaults.enableIncrementalDatasetRefresh;
        }

        public Builder assetName(String assetName) {
            this.assetName = Objects.requireNonNull(assetName);
            return this;
        }
        public Builder datasetVersion(String datasetVersion) {
            this.datasetVersion = Objects.requireNonNull(datasetVersion);
            return this;
        }
        public Builder enableIncrementalDatasetRefresh(@Nullable Boolean enableIncrementalDatasetRefresh) {
            this.enableIncrementalDatasetRefresh = enableIncrementalDatasetRefresh;
            return this;
        }        public LabelingDatasetConfigurationResponse build() {
            return new LabelingDatasetConfigurationResponse(assetName, datasetVersion, enableIncrementalDatasetRefresh);
        }
    }
}
