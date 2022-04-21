// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ssmincidents.inputs;

import com.pulumi.awsnative.ssmincidents.inputs.ResponsePlanSsmAutomation;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The automation configuration to launch.
 * 
 */
public final class ResponsePlanAction extends com.pulumi.resources.InvokeArgs {

    public static final ResponsePlanAction Empty = new ResponsePlanAction();

    @Import(name="ssmAutomation")
    private @Nullable ResponsePlanSsmAutomation ssmAutomation;

    public Optional<ResponsePlanSsmAutomation> ssmAutomation() {
        return Optional.ofNullable(this.ssmAutomation);
    }

    private ResponsePlanAction() {}

    private ResponsePlanAction(ResponsePlanAction $) {
        this.ssmAutomation = $.ssmAutomation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResponsePlanAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResponsePlanAction $;

        public Builder() {
            $ = new ResponsePlanAction();
        }

        public Builder(ResponsePlanAction defaults) {
            $ = new ResponsePlanAction(Objects.requireNonNull(defaults));
        }

        public Builder ssmAutomation(@Nullable ResponsePlanSsmAutomation ssmAutomation) {
            $.ssmAutomation = ssmAutomation;
            return this;
        }

        public ResponsePlanAction build() {
            return $;
        }
    }

}
