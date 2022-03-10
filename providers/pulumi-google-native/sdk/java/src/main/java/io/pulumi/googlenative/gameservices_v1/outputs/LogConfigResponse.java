// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.gameservices_v1.outputs.CloudAuditOptionsResponse;
import io.pulumi.googlenative.gameservices_v1.outputs.CounterOptionsResponse;
import io.pulumi.googlenative.gameservices_v1.outputs.DataAccessOptionsResponse;
import java.util.Objects;

@OutputCustomType
public final class LogConfigResponse {
    /**
     * Cloud audit options.
     * 
     */
    private final CloudAuditOptionsResponse cloudAudit;
    /**
     * Counter options.
     * 
     */
    private final CounterOptionsResponse counter;
    /**
     * Data access options.
     * 
     */
    private final DataAccessOptionsResponse dataAccess;

    @OutputCustomType.Constructor
    private LogConfigResponse(
        @OutputCustomType.Parameter("cloudAudit") CloudAuditOptionsResponse cloudAudit,
        @OutputCustomType.Parameter("counter") CounterOptionsResponse counter,
        @OutputCustomType.Parameter("dataAccess") DataAccessOptionsResponse dataAccess) {
        this.cloudAudit = cloudAudit;
        this.counter = counter;
        this.dataAccess = dataAccess;
    }

    /**
     * Cloud audit options.
     * 
    */
    public CloudAuditOptionsResponse getCloudAudit() {
        return this.cloudAudit;
    }
    /**
     * Counter options.
     * 
    */
    public CounterOptionsResponse getCounter() {
        return this.counter;
    }
    /**
     * Data access options.
     * 
    */
    public DataAccessOptionsResponse getDataAccess() {
        return this.dataAccess;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudAuditOptionsResponse cloudAudit;
        private CounterOptionsResponse counter;
        private DataAccessOptionsResponse dataAccess;

        public Builder() {
    	      // Empty
        }

        public Builder(LogConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudAudit = defaults.cloudAudit;
    	      this.counter = defaults.counter;
    	      this.dataAccess = defaults.dataAccess;
        }

        public Builder setCloudAudit(CloudAuditOptionsResponse cloudAudit) {
            this.cloudAudit = Objects.requireNonNull(cloudAudit);
            return this;
        }

        public Builder setCounter(CounterOptionsResponse counter) {
            this.counter = Objects.requireNonNull(counter);
            return this;
        }

        public Builder setDataAccess(DataAccessOptionsResponse dataAccess) {
            this.dataAccess = Objects.requireNonNull(dataAccess);
            return this;
        }
        public LogConfigResponse build() {
            return new LogConfigResponse(cloudAudit, counter, dataAccess);
        }
    }
}
