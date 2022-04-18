// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * Target scaling by network usage. Only applicable in the App Engine flexible environment.
 * 
 */
public final class NetworkUtilizationResponse extends com.pulumi.resources.InvokeArgs {

    public static final NetworkUtilizationResponse Empty = new NetworkUtilizationResponse();

    /**
     * Target bytes received per second.
     * 
     */
    @Import(name="targetReceivedBytesPerSecond", required=true)
      private final Integer targetReceivedBytesPerSecond;

    public Integer targetReceivedBytesPerSecond() {
        return this.targetReceivedBytesPerSecond;
    }

    /**
     * Target packets received per second.
     * 
     */
    @Import(name="targetReceivedPacketsPerSecond", required=true)
      private final Integer targetReceivedPacketsPerSecond;

    public Integer targetReceivedPacketsPerSecond() {
        return this.targetReceivedPacketsPerSecond;
    }

    /**
     * Target bytes sent per second.
     * 
     */
    @Import(name="targetSentBytesPerSecond", required=true)
      private final Integer targetSentBytesPerSecond;

    public Integer targetSentBytesPerSecond() {
        return this.targetSentBytesPerSecond;
    }

    /**
     * Target packets sent per second.
     * 
     */
    @Import(name="targetSentPacketsPerSecond", required=true)
      private final Integer targetSentPacketsPerSecond;

    public Integer targetSentPacketsPerSecond() {
        return this.targetSentPacketsPerSecond;
    }

    public NetworkUtilizationResponse(
        Integer targetReceivedBytesPerSecond,
        Integer targetReceivedPacketsPerSecond,
        Integer targetSentBytesPerSecond,
        Integer targetSentPacketsPerSecond) {
        this.targetReceivedBytesPerSecond = Objects.requireNonNull(targetReceivedBytesPerSecond, "expected parameter 'targetReceivedBytesPerSecond' to be non-null");
        this.targetReceivedPacketsPerSecond = Objects.requireNonNull(targetReceivedPacketsPerSecond, "expected parameter 'targetReceivedPacketsPerSecond' to be non-null");
        this.targetSentBytesPerSecond = Objects.requireNonNull(targetSentBytesPerSecond, "expected parameter 'targetSentBytesPerSecond' to be non-null");
        this.targetSentPacketsPerSecond = Objects.requireNonNull(targetSentPacketsPerSecond, "expected parameter 'targetSentPacketsPerSecond' to be non-null");
    }

    private NetworkUtilizationResponse() {
        this.targetReceivedBytesPerSecond = null;
        this.targetReceivedPacketsPerSecond = null;
        this.targetSentBytesPerSecond = null;
        this.targetSentPacketsPerSecond = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkUtilizationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer targetReceivedBytesPerSecond;
        private Integer targetReceivedPacketsPerSecond;
        private Integer targetSentBytesPerSecond;
        private Integer targetSentPacketsPerSecond;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkUtilizationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetReceivedBytesPerSecond = defaults.targetReceivedBytesPerSecond;
    	      this.targetReceivedPacketsPerSecond = defaults.targetReceivedPacketsPerSecond;
    	      this.targetSentBytesPerSecond = defaults.targetSentBytesPerSecond;
    	      this.targetSentPacketsPerSecond = defaults.targetSentPacketsPerSecond;
        }

        public Builder targetReceivedBytesPerSecond(Integer targetReceivedBytesPerSecond) {
            this.targetReceivedBytesPerSecond = Objects.requireNonNull(targetReceivedBytesPerSecond);
            return this;
        }
        public Builder targetReceivedPacketsPerSecond(Integer targetReceivedPacketsPerSecond) {
            this.targetReceivedPacketsPerSecond = Objects.requireNonNull(targetReceivedPacketsPerSecond);
            return this;
        }
        public Builder targetSentBytesPerSecond(Integer targetSentBytesPerSecond) {
            this.targetSentBytesPerSecond = Objects.requireNonNull(targetSentBytesPerSecond);
            return this;
        }
        public Builder targetSentPacketsPerSecond(Integer targetSentPacketsPerSecond) {
            this.targetSentPacketsPerSecond = Objects.requireNonNull(targetSentPacketsPerSecond);
            return this;
        }        public NetworkUtilizationResponse build() {
            return new NetworkUtilizationResponse(targetReceivedBytesPerSecond, targetReceivedPacketsPerSecond, targetSentBytesPerSecond, targetSentPacketsPerSecond);
        }
    }
}
