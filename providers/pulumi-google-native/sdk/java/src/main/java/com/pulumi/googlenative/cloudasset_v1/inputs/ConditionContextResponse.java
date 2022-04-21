// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudasset_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The IAM conditions context.
 * 
 */
public final class ConditionContextResponse extends com.pulumi.resources.InvokeArgs {

    public static final ConditionContextResponse Empty = new ConditionContextResponse();

    /**
     * The hypothetical access timestamp to evaluate IAM conditions. Note that this value must not be earlier than the current time; otherwise, an INVALID_ARGUMENT error will be returned.
     * 
     */
    @Import(name="accessTime", required=true)
    private String accessTime;

    public String accessTime() {
        return this.accessTime;
    }

    private ConditionContextResponse() {}

    private ConditionContextResponse(ConditionContextResponse $) {
        this.accessTime = $.accessTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConditionContextResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConditionContextResponse $;

        public Builder() {
            $ = new ConditionContextResponse();
        }

        public Builder(ConditionContextResponse defaults) {
            $ = new ConditionContextResponse(Objects.requireNonNull(defaults));
        }

        public Builder accessTime(String accessTime) {
            $.accessTime = accessTime;
            return this;
        }

        public ConditionContextResponse build() {
            $.accessTime = Objects.requireNonNull($.accessTime, "expected parameter 'accessTime' to be non-null");
            return $;
        }
    }

}
