// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.connectors_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Determines whether or no a connection is locked. If locked, a reason must be specified.
 * 
 */
public final class LockConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final LockConfigResponse Empty = new LockConfigResponse();

    /**
     * Indicates whether or not the connection is locked.
     * 
     */
    @Import(name="locked", required=true)
    private Boolean locked;

    public Boolean locked() {
        return this.locked;
    }

    /**
     * Describes why a connection is locked.
     * 
     */
    @Import(name="reason", required=true)
    private String reason;

    public String reason() {
        return this.reason;
    }

    private LockConfigResponse() {}

    private LockConfigResponse(LockConfigResponse $) {
        this.locked = $.locked;
        this.reason = $.reason;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LockConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LockConfigResponse $;

        public Builder() {
            $ = new LockConfigResponse();
        }

        public Builder(LockConfigResponse defaults) {
            $ = new LockConfigResponse(Objects.requireNonNull(defaults));
        }

        public Builder locked(Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder reason(String reason) {
            $.reason = reason;
            return this;
        }

        public LockConfigResponse build() {
            $.locked = Objects.requireNonNull($.locked, "expected parameter 'locked' to be non-null");
            $.reason = Objects.requireNonNull($.reason, "expected parameter 'reason' to be non-null");
            return $;
        }
    }

}
