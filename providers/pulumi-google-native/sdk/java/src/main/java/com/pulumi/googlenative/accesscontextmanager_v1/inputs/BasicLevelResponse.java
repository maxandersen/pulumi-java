// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.accesscontextmanager_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.accesscontextmanager_v1.inputs.ConditionResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * `BasicLevel` is an `AccessLevel` using a set of recommended features.
 * 
 */
public final class BasicLevelResponse extends com.pulumi.resources.InvokeArgs {

    public static final BasicLevelResponse Empty = new BasicLevelResponse();

    /**
     * How the `conditions` list should be combined to determine if a request is granted this `AccessLevel`. If AND is used, each `Condition` in `conditions` must be satisfied for the `AccessLevel` to be applied. If OR is used, at least one `Condition` in `conditions` must be satisfied for the `AccessLevel` to be applied. Default behavior is AND.
     * 
     */
    @Import(name="combiningFunction", required=true)
    private String combiningFunction;

    public String combiningFunction() {
        return this.combiningFunction;
    }

    /**
     * A list of requirements for the `AccessLevel` to be granted.
     * 
     */
    @Import(name="conditions", required=true)
    private List<ConditionResponse> conditions;

    public List<ConditionResponse> conditions() {
        return this.conditions;
    }

    private BasicLevelResponse() {}

    private BasicLevelResponse(BasicLevelResponse $) {
        this.combiningFunction = $.combiningFunction;
        this.conditions = $.conditions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BasicLevelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BasicLevelResponse $;

        public Builder() {
            $ = new BasicLevelResponse();
        }

        public Builder(BasicLevelResponse defaults) {
            $ = new BasicLevelResponse(Objects.requireNonNull(defaults));
        }

        public Builder combiningFunction(String combiningFunction) {
            $.combiningFunction = combiningFunction;
            return this;
        }

        public Builder conditions(List<ConditionResponse> conditions) {
            $.conditions = conditions;
            return this;
        }

        public Builder conditions(ConditionResponse... conditions) {
            return conditions(List.of(conditions));
        }

        public BasicLevelResponse build() {
            $.combiningFunction = Objects.requireNonNull($.combiningFunction, "expected parameter 'combiningFunction' to be non-null");
            $.conditions = Objects.requireNonNull($.conditions, "expected parameter 'conditions' to be non-null");
            return $;
        }
    }

}
