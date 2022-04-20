// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.azurenative.insights.inputs.AlertRuleLeafConditionResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An Activity Log Alert rule condition that is met when all its member conditions are met.
 * Each condition can be of one of the following types:
 * __Important__: Each type has its unique subset of properties. Properties from different types CANNOT exist in one condition.
 *    * __Leaf Condition -__ must contain &#39;field&#39; and either &#39;equals&#39; or &#39;containsAny&#39;.
 *        _Please note, &#39;anyOf&#39; should __not__ be set in a Leaf Condition._
 *   * __AnyOf Condition -__ must contain __only__ &#39;anyOf&#39; (which is an array of Leaf Conditions).
 *       _Please note, &#39;field&#39;, &#39;equals&#39; and &#39;containsAny&#39; should __not__ be set in an AnyOf Condition._
 * 
 */
public final class AlertRuleAnyOfOrLeafConditionResponse extends com.pulumi.resources.InvokeArgs {

    public static final AlertRuleAnyOfOrLeafConditionResponse Empty = new AlertRuleAnyOfOrLeafConditionResponse();

    /**
     * An Activity Log Alert rule condition that is met when at least one of its member leaf conditions are met.
     * 
     */
    @Import(name="anyOf")
      private final @Nullable List<AlertRuleLeafConditionResponse> anyOf;

    public List<AlertRuleLeafConditionResponse> anyOf() {
        return this.anyOf == null ? List.of() : this.anyOf;
    }

    /**
     * The value of the event&#39;s field will be compared to the values in this array (case-insensitive) to determine if the condition is met.
     * 
     */
    @Import(name="containsAny")
      private final @Nullable List<String> containsAny;

    public List<String> containsAny() {
        return this.containsAny == null ? List.of() : this.containsAny;
    }

    /**
     * The value of the event&#39;s field will be compared to this value (case-insensitive) to determine if the condition is met.
     * 
     */
    @Import(name="equals")
      private final @Nullable String equals;

    public Optional<String> equals_() {
        return this.equals == null ? Optional.empty() : Optional.ofNullable(this.equals);
    }

    /**
     * The name of the Activity Log event&#39;s field that this condition will examine.
     * The possible values for this field are (case-insensitive): &#39;resourceId&#39;, &#39;category&#39;, &#39;caller&#39;, &#39;level&#39;, &#39;operationName&#39;, &#39;resourceGroup&#39;, &#39;resourceProvider&#39;, &#39;status&#39;, &#39;subStatus&#39;, &#39;resourceType&#39;, or anything beginning with &#39;properties&#39;.
     * 
     */
    @Import(name="field")
      private final @Nullable String field;

    public Optional<String> field() {
        return this.field == null ? Optional.empty() : Optional.ofNullable(this.field);
    }

    public AlertRuleAnyOfOrLeafConditionResponse(
        @Nullable List<AlertRuleLeafConditionResponse> anyOf,
        @Nullable List<String> containsAny,
        @Nullable String equals,
        @Nullable String field) {
        this.anyOf = anyOf;
        this.containsAny = containsAny;
        this.equals = equals;
        this.field = field;
    }

    private AlertRuleAnyOfOrLeafConditionResponse() {
        this.anyOf = List.of();
        this.containsAny = List.of();
        this.equals = null;
        this.field = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertRuleAnyOfOrLeafConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<AlertRuleLeafConditionResponse> anyOf;
        private @Nullable List<String> containsAny;
        private @Nullable String equals;
        private @Nullable String field;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertRuleAnyOfOrLeafConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.anyOf = defaults.anyOf;
    	      this.containsAny = defaults.containsAny;
    	      this.equals = defaults.equals;
    	      this.field = defaults.field;
        }

        public Builder anyOf(@Nullable List<AlertRuleLeafConditionResponse> anyOf) {
            this.anyOf = anyOf;
            return this;
        }
        public Builder anyOf(AlertRuleLeafConditionResponse... anyOf) {
            return anyOf(List.of(anyOf));
        }
        public Builder containsAny(@Nullable List<String> containsAny) {
            this.containsAny = containsAny;
            return this;
        }
        public Builder containsAny(String... containsAny) {
            return containsAny(List.of(containsAny));
        }
        public Builder equals_(@Nullable String equals) {
            this.equals = equals;
            return this;
        }
        public Builder field(@Nullable String field) {
            this.field = field;
            return this;
        }        public AlertRuleAnyOfOrLeafConditionResponse build() {
            return new AlertRuleAnyOfOrLeafConditionResponse(anyOf, containsAny, equals, field);
        }
    }
}
