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
    private Integer targetReceivedBytesPerSecond;

    public Integer targetReceivedBytesPerSecond() {
        return this.targetReceivedBytesPerSecond;
    }

    /**
     * Target packets received per second.
     * 
     */
    @Import(name="targetReceivedPacketsPerSecond", required=true)
    private Integer targetReceivedPacketsPerSecond;

    public Integer targetReceivedPacketsPerSecond() {
        return this.targetReceivedPacketsPerSecond;
    }

    /**
     * Target bytes sent per second.
     * 
     */
    @Import(name="targetSentBytesPerSecond", required=true)
    private Integer targetSentBytesPerSecond;

    public Integer targetSentBytesPerSecond() {
        return this.targetSentBytesPerSecond;
    }

    /**
     * Target packets sent per second.
     * 
     */
    @Import(name="targetSentPacketsPerSecond", required=true)
    private Integer targetSentPacketsPerSecond;

    public Integer targetSentPacketsPerSecond() {
        return this.targetSentPacketsPerSecond;
    }

    private NetworkUtilizationResponse() {}

    private NetworkUtilizationResponse(NetworkUtilizationResponse $) {
        this.targetReceivedBytesPerSecond = $.targetReceivedBytesPerSecond;
        this.targetReceivedPacketsPerSecond = $.targetReceivedPacketsPerSecond;
        this.targetSentBytesPerSecond = $.targetSentBytesPerSecond;
        this.targetSentPacketsPerSecond = $.targetSentPacketsPerSecond;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkUtilizationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkUtilizationResponse $;

        public Builder() {
            $ = new NetworkUtilizationResponse();
        }

        public Builder(NetworkUtilizationResponse defaults) {
            $ = new NetworkUtilizationResponse(Objects.requireNonNull(defaults));
        }

        public Builder targetReceivedBytesPerSecond(Integer targetReceivedBytesPerSecond) {
            $.targetReceivedBytesPerSecond = targetReceivedBytesPerSecond;
            return this;
        }

        public Builder targetReceivedPacketsPerSecond(Integer targetReceivedPacketsPerSecond) {
            $.targetReceivedPacketsPerSecond = targetReceivedPacketsPerSecond;
            return this;
        }

        public Builder targetSentBytesPerSecond(Integer targetSentBytesPerSecond) {
            $.targetSentBytesPerSecond = targetSentBytesPerSecond;
            return this;
        }

        public Builder targetSentPacketsPerSecond(Integer targetSentPacketsPerSecond) {
            $.targetSentPacketsPerSecond = targetSentPacketsPerSecond;
            return this;
        }

        public NetworkUtilizationResponse build() {
            $.targetReceivedBytesPerSecond = Objects.requireNonNull($.targetReceivedBytesPerSecond, "expected parameter 'targetReceivedBytesPerSecond' to be non-null");
            $.targetReceivedPacketsPerSecond = Objects.requireNonNull($.targetReceivedPacketsPerSecond, "expected parameter 'targetReceivedPacketsPerSecond' to be non-null");
            $.targetSentBytesPerSecond = Objects.requireNonNull($.targetSentBytesPerSecond, "expected parameter 'targetSentBytesPerSecond' to be non-null");
            $.targetSentPacketsPerSecond = Objects.requireNonNull($.targetSentPacketsPerSecond, "expected parameter 'targetSentPacketsPerSecond' to be non-null");
            return $;
        }
    }

}
