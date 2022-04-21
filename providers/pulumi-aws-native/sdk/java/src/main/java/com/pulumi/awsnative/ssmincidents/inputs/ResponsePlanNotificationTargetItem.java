// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ssmincidents.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A notification target.
 * 
 */
public final class ResponsePlanNotificationTargetItem extends com.pulumi.resources.InvokeArgs {

    public static final ResponsePlanNotificationTargetItem Empty = new ResponsePlanNotificationTargetItem();

    @Import(name="snsTopicArn")
    private @Nullable String snsTopicArn;

    public Optional<String> snsTopicArn() {
        return Optional.ofNullable(this.snsTopicArn);
    }

    private ResponsePlanNotificationTargetItem() {}

    private ResponsePlanNotificationTargetItem(ResponsePlanNotificationTargetItem $) {
        this.snsTopicArn = $.snsTopicArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResponsePlanNotificationTargetItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResponsePlanNotificationTargetItem $;

        public Builder() {
            $ = new ResponsePlanNotificationTargetItem();
        }

        public Builder(ResponsePlanNotificationTargetItem defaults) {
            $ = new ResponsePlanNotificationTargetItem(Objects.requireNonNull(defaults));
        }

        public Builder snsTopicArn(@Nullable String snsTopicArn) {
            $.snsTopicArn = snsTopicArn;
            return this;
        }

        public ResponsePlanNotificationTargetItem build() {
            return $;
        }
    }

}
