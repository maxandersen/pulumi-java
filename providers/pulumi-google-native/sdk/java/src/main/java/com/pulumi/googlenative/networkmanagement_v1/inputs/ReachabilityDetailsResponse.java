// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkmanagement_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.networkmanagement_v1.inputs.StatusResponse;
import com.pulumi.googlenative.networkmanagement_v1.inputs.TraceResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Results of the configuration analysis from the last run of the test.
 * 
 */
public final class ReachabilityDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final ReachabilityDetailsResponse Empty = new ReachabilityDetailsResponse();

    /**
     * The details of a failure or a cancellation of reachability analysis.
     * 
     */
    @Import(name="error", required=true)
      private final StatusResponse error;

    public StatusResponse error() {
        return this.error;
    }

    /**
     * The overall result of the test&#39;s configuration analysis.
     * 
     */
    @Import(name="result", required=true)
      private final String result;

    public String result() {
        return this.result;
    }

    /**
     * Result may contain a list of traces if a test has multiple possible paths in the network, such as when destination endpoint is a load balancer with multiple backends.
     * 
     */
    @Import(name="traces", required=true)
      private final List<TraceResponse> traces;

    public List<TraceResponse> traces() {
        return this.traces;
    }

    /**
     * The time of the configuration analysis.
     * 
     */
    @Import(name="verifyTime", required=true)
      private final String verifyTime;

    public String verifyTime() {
        return this.verifyTime;
    }

    public ReachabilityDetailsResponse(
        StatusResponse error,
        String result,
        List<TraceResponse> traces,
        String verifyTime) {
        this.error = Objects.requireNonNull(error, "expected parameter 'error' to be non-null");
        this.result = Objects.requireNonNull(result, "expected parameter 'result' to be non-null");
        this.traces = Objects.requireNonNull(traces, "expected parameter 'traces' to be non-null");
        this.verifyTime = Objects.requireNonNull(verifyTime, "expected parameter 'verifyTime' to be non-null");
    }

    private ReachabilityDetailsResponse() {
        this.error = null;
        this.result = null;
        this.traces = List.of();
        this.verifyTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReachabilityDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StatusResponse error;
        private String result;
        private List<TraceResponse> traces;
        private String verifyTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ReachabilityDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.error = defaults.error;
    	      this.result = defaults.result;
    	      this.traces = defaults.traces;
    	      this.verifyTime = defaults.verifyTime;
        }

        public Builder error(StatusResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }
        public Builder result(String result) {
            this.result = Objects.requireNonNull(result);
            return this;
        }
        public Builder traces(List<TraceResponse> traces) {
            this.traces = Objects.requireNonNull(traces);
            return this;
        }
        public Builder traces(TraceResponse... traces) {
            return traces(List.of(traces));
        }
        public Builder verifyTime(String verifyTime) {
            this.verifyTime = Objects.requireNonNull(verifyTime);
            return this;
        }        public ReachabilityDetailsResponse build() {
            return new ReachabilityDetailsResponse(error, result, traces, verifyTime);
        }
    }
}
