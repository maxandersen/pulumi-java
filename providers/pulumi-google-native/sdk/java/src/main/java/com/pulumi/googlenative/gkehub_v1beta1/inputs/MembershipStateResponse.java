// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * State of the Membership resource.
 * 
 */
public final class MembershipStateResponse extends com.pulumi.resources.InvokeArgs {

    public static final MembershipStateResponse Empty = new MembershipStateResponse();

    /**
     * The current state of the Membership resource.
     * 
     */
    @Import(name="code", required=true)
    private String code;

    public String code() {
        return this.code;
    }

    /**
     * This field is never set by the Hub Service.
     * 
     */
    @Import(name="description", required=true)
    private String description;

    public String description() {
        return this.description;
    }

    /**
     * This field is never set by the Hub Service.
     * 
     */
    @Import(name="updateTime", required=true)
    private String updateTime;

    public String updateTime() {
        return this.updateTime;
    }

    private MembershipStateResponse() {}

    private MembershipStateResponse(MembershipStateResponse $) {
        this.code = $.code;
        this.description = $.description;
        this.updateTime = $.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MembershipStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MembershipStateResponse $;

        public Builder() {
            $ = new MembershipStateResponse();
        }

        public Builder(MembershipStateResponse defaults) {
            $ = new MembershipStateResponse(Objects.requireNonNull(defaults));
        }

        public Builder code(String code) {
            $.code = code;
            return this;
        }

        public Builder description(String description) {
            $.description = description;
            return this;
        }

        public Builder updateTime(String updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        public MembershipStateResponse build() {
            $.code = Objects.requireNonNull($.code, "expected parameter 'code' to be non-null");
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.updateTime = Objects.requireNonNull($.updateTime, "expected parameter 'updateTime' to be non-null");
            return $;
        }
    }

}
