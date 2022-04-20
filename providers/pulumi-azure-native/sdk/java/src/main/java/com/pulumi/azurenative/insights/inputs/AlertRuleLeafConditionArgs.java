// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An Activity Log Alert rule condition that is met by comparing the field and value of an Activity Log event.
 * This condition must contain &#39;field&#39; and either &#39;equals&#39; or &#39;containsAny&#39;.
 * 
 */
public final class AlertRuleLeafConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertRuleLeafConditionArgs Empty = new AlertRuleLeafConditionArgs();

    /**
     * The value of the event&#39;s field will be compared to the values in this array (case-insensitive) to determine if the condition is met.
     * 
     */
    @Import(name="containsAny")
      private final @Nullable Output<List<String>> containsAny;

    public Output<List<String>> containsAny() {
        return this.containsAny == null ? Codegen.empty() : this.containsAny;
    }

    /**
     * The value of the event&#39;s field will be compared to this value (case-insensitive) to determine if the condition is met.
     * 
     */
    @Import(name="equals")
      private final @Nullable Output<String> equals;

    public Output<String> equals_() {
        return this.equals == null ? Codegen.empty() : this.equals;
    }

    /**
     * The name of the Activity Log event&#39;s field that this condition will examine.
     * The possible values for this field are (case-insensitive): &#39;resourceId&#39;, &#39;category&#39;, &#39;caller&#39;, &#39;level&#39;, &#39;operationName&#39;, &#39;resourceGroup&#39;, &#39;resourceProvider&#39;, &#39;status&#39;, &#39;subStatus&#39;, &#39;resourceType&#39;, or anything beginning with &#39;properties&#39;.
     * 
     */
    @Import(name="field")
      private final @Nullable Output<String> field;

    public Output<String> field() {
        return this.field == null ? Codegen.empty() : this.field;
    }

    public AlertRuleLeafConditionArgs(
        @Nullable Output<List<String>> containsAny,
        @Nullable Output<String> equals,
        @Nullable Output<String> field) {
        this.containsAny = containsAny;
        this.equals = equals;
        this.field = field;
    }

    private AlertRuleLeafConditionArgs() {
        this.containsAny = Codegen.empty();
        this.equals = Codegen.empty();
        this.field = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertRuleLeafConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> containsAny;
        private @Nullable Output<String> equals;
        private @Nullable Output<String> field;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertRuleLeafConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containsAny = defaults.containsAny;
    	      this.equals = defaults.equals;
    	      this.field = defaults.field;
        }

        public Builder containsAny(@Nullable Output<List<String>> containsAny) {
            this.containsAny = containsAny;
            return this;
        }
        public Builder containsAny(@Nullable List<String> containsAny) {
            this.containsAny = Codegen.ofNullable(containsAny);
            return this;
        }
        public Builder containsAny(String... containsAny) {
            return containsAny(List.of(containsAny));
        }
        public Builder equals_(@Nullable Output<String> equals) {
            this.equals = equals;
            return this;
        }
        public Builder equals_(@Nullable String equals) {
            this.equals = Codegen.ofNullable(equals);
            return this;
        }
        public Builder field(@Nullable Output<String> field) {
            this.field = field;
            return this;
        }
        public Builder field(@Nullable String field) {
            this.field = Codegen.ofNullable(field);
            return this;
        }        public AlertRuleLeafConditionArgs build() {
            return new AlertRuleLeafConditionArgs(containsAny, equals, field);
        }
    }
}
