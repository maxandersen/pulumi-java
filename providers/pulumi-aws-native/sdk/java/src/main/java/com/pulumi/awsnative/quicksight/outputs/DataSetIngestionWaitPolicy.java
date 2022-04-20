// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataSetIngestionWaitPolicy {
    /**
     * &lt;p&gt;The maximum time (in hours) to wait for Ingestion to complete. Default timeout is 36 hours.
     *  Applicable only when DataSetImportMode mode is set to SPICE and WaitForSpiceIngestion is set to true.&lt;/p&gt;
     * 
     */
    private final @Nullable Double ingestionWaitTimeInHours;
    /**
     * &lt;p&gt;Wait for SPICE ingestion to finish to mark dataset creation/update successful. Default (true).
     *   Applicable only when DataSetImportMode mode is set to SPICE.&lt;/p&gt;
     * 
     */
    private final @Nullable Boolean waitForSpiceIngestion;

    @CustomType.Constructor
    private DataSetIngestionWaitPolicy(
        @CustomType.Parameter("ingestionWaitTimeInHours") @Nullable Double ingestionWaitTimeInHours,
        @CustomType.Parameter("waitForSpiceIngestion") @Nullable Boolean waitForSpiceIngestion) {
        this.ingestionWaitTimeInHours = ingestionWaitTimeInHours;
        this.waitForSpiceIngestion = waitForSpiceIngestion;
    }

    /**
     * &lt;p&gt;The maximum time (in hours) to wait for Ingestion to complete. Default timeout is 36 hours.
     *  Applicable only when DataSetImportMode mode is set to SPICE and WaitForSpiceIngestion is set to true.&lt;/p&gt;
     * 
    */
    public Optional<Double> ingestionWaitTimeInHours() {
        return Optional.ofNullable(this.ingestionWaitTimeInHours);
    }
    /**
     * &lt;p&gt;Wait for SPICE ingestion to finish to mark dataset creation/update successful. Default (true).
     *   Applicable only when DataSetImportMode mode is set to SPICE.&lt;/p&gt;
     * 
    */
    public Optional<Boolean> waitForSpiceIngestion() {
        return Optional.ofNullable(this.waitForSpiceIngestion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSetIngestionWaitPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double ingestionWaitTimeInHours;
        private @Nullable Boolean waitForSpiceIngestion;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSetIngestionWaitPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ingestionWaitTimeInHours = defaults.ingestionWaitTimeInHours;
    	      this.waitForSpiceIngestion = defaults.waitForSpiceIngestion;
        }

        public Builder ingestionWaitTimeInHours(@Nullable Double ingestionWaitTimeInHours) {
            this.ingestionWaitTimeInHours = ingestionWaitTimeInHours;
            return this;
        }
        public Builder waitForSpiceIngestion(@Nullable Boolean waitForSpiceIngestion) {
            this.waitForSpiceIngestion = waitForSpiceIngestion;
            return this;
        }        public DataSetIngestionWaitPolicy build() {
            return new DataSetIngestionWaitPolicy(ingestionWaitTimeInHours, waitForSpiceIngestion);
        }
    }
}
