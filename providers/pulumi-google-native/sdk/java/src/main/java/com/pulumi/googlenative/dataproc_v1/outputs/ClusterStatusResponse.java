// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ClusterStatusResponse {
    /**
     * Optional. Output only. Details of cluster's state.
     * 
     */
    private final String detail;
    /**
     * The cluster's state.
     * 
     */
    private final String state;
    /**
     * Time when this state was entered (see JSON representation of Timestamp (https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * 
     */
    private final String stateStartTime;
    /**
     * Additional state information that includes status reported by the agent.
     * 
     */
    private final String substate;

    @CustomType.Constructor
    private ClusterStatusResponse(
        @CustomType.Parameter("detail") String detail,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("stateStartTime") String stateStartTime,
        @CustomType.Parameter("substate") String substate) {
        this.detail = detail;
        this.state = state;
        this.stateStartTime = stateStartTime;
        this.substate = substate;
    }

    /**
     * Optional. Output only. Details of cluster's state.
     * 
    */
    public String detail() {
        return this.detail;
    }
    /**
     * The cluster's state.
     * 
    */
    public String state() {
        return this.state;
    }
    /**
     * Time when this state was entered (see JSON representation of Timestamp (https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * 
    */
    public String stateStartTime() {
        return this.stateStartTime;
    }
    /**
     * Additional state information that includes status reported by the agent.
     * 
    */
    public String substate() {
        return this.substate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String detail;
        private String state;
        private String stateStartTime;
        private String substate;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.detail = defaults.detail;
    	      this.state = defaults.state;
    	      this.stateStartTime = defaults.stateStartTime;
    	      this.substate = defaults.substate;
        }

        public Builder detail(String detail) {
            this.detail = Objects.requireNonNull(detail);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder stateStartTime(String stateStartTime) {
            this.stateStartTime = Objects.requireNonNull(stateStartTime);
            return this;
        }
        public Builder substate(String substate) {
            this.substate = Objects.requireNonNull(substate);
            return this;
        }        public ClusterStatusResponse build() {
            return new ClusterStatusResponse(detail, state, stateStartTime, substate);
        }
    }
}
