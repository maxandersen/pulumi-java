// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The status of a cluster and its instances.
 * 
 */
public final class ClusterStatusResponse extends com.pulumi.resources.InvokeArgs {

    public static final ClusterStatusResponse Empty = new ClusterStatusResponse();

    /**
     * Optional. Output only. Details of cluster&#39;s state.
     * 
     */
    @Import(name="detail", required=true)
    private String detail;

    public String detail() {
        return this.detail;
    }

    /**
     * The cluster&#39;s state.
     * 
     */
    @Import(name="state", required=true)
    private String state;

    public String state() {
        return this.state;
    }

    /**
     * Time when this state was entered (see JSON representation of Timestamp (https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * 
     */
    @Import(name="stateStartTime", required=true)
    private String stateStartTime;

    public String stateStartTime() {
        return this.stateStartTime;
    }

    /**
     * Additional state information that includes status reported by the agent.
     * 
     */
    @Import(name="substate", required=true)
    private String substate;

    public String substate() {
        return this.substate;
    }

    private ClusterStatusResponse() {}

    private ClusterStatusResponse(ClusterStatusResponse $) {
        this.detail = $.detail;
        this.state = $.state;
        this.stateStartTime = $.stateStartTime;
        this.substate = $.substate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterStatusResponse $;

        public Builder() {
            $ = new ClusterStatusResponse();
        }

        public Builder(ClusterStatusResponse defaults) {
            $ = new ClusterStatusResponse(Objects.requireNonNull(defaults));
        }

        public Builder detail(String detail) {
            $.detail = detail;
            return this;
        }

        public Builder state(String state) {
            $.state = state;
            return this;
        }

        public Builder stateStartTime(String stateStartTime) {
            $.stateStartTime = stateStartTime;
            return this;
        }

        public Builder substate(String substate) {
            $.substate = substate;
            return this;
        }

        public ClusterStatusResponse build() {
            $.detail = Objects.requireNonNull($.detail, "expected parameter 'detail' to be non-null");
            $.state = Objects.requireNonNull($.state, "expected parameter 'state' to be non-null");
            $.stateStartTime = Objects.requireNonNull($.stateStartTime, "expected parameter 'stateStartTime' to be non-null");
            $.substate = Objects.requireNonNull($.substate, "expected parameter 'substate' to be non-null");
            return $;
        }
    }

}
