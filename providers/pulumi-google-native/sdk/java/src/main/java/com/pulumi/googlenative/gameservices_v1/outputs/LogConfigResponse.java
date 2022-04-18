// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gameservices_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.gameservices_v1.outputs.CloudAuditOptionsResponse;
import com.pulumi.googlenative.gameservices_v1.outputs.CounterOptionsResponse;
import com.pulumi.googlenative.gameservices_v1.outputs.DataAccessOptionsResponse;
import java.util.Objects;

@CustomType
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

    @CustomType.Constructor
    private LogConfigResponse(
        @CustomType.Parameter("cloudAudit") CloudAuditOptionsResponse cloudAudit,
        @CustomType.Parameter("counter") CounterOptionsResponse counter,
        @CustomType.Parameter("dataAccess") DataAccessOptionsResponse dataAccess) {
        this.cloudAudit = cloudAudit;
        this.counter = counter;
        this.dataAccess = dataAccess;
    }

    /**
     * Cloud audit options.
     * 
    */
    public CloudAuditOptionsResponse cloudAudit() {
        return this.cloudAudit;
    }
    /**
     * Counter options.
     * 
    */
    public CounterOptionsResponse counter() {
        return this.counter;
    }
    /**
     * Data access options.
     * 
    */
    public DataAccessOptionsResponse dataAccess() {
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

        public Builder cloudAudit(CloudAuditOptionsResponse cloudAudit) {
            this.cloudAudit = Objects.requireNonNull(cloudAudit);
            return this;
        }
        public Builder counter(CounterOptionsResponse counter) {
            this.counter = Objects.requireNonNull(counter);
            return this;
        }
        public Builder dataAccess(DataAccessOptionsResponse dataAccess) {
            this.dataAccess = Objects.requireNonNull(dataAccess);
            return this;
        }        public LogConfigResponse build() {
            return new LogConfigResponse(cloudAudit, counter, dataAccess);
        }
    }
}
