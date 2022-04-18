// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetSlotTypeEnumerationValue extends com.pulumi.resources.InvokeArgs {

    public static final GetSlotTypeEnumerationValue Empty = new GetSlotTypeEnumerationValue();

    @Import(name="synonyms", required=true)
      private final List<String> synonyms;

    public List<String> synonyms() {
        return this.synonyms;
    }

    @Import(name="value", required=true)
      private final String value;

    public String value() {
        return this.value;
    }

    public GetSlotTypeEnumerationValue(
        List<String> synonyms,
        String value) {
        this.synonyms = Objects.requireNonNull(synonyms, "expected parameter 'synonyms' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private GetSlotTypeEnumerationValue() {
        this.synonyms = List.of();
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSlotTypeEnumerationValue defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> synonyms;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSlotTypeEnumerationValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.synonyms = defaults.synonyms;
    	      this.value = defaults.value;
        }

        public Builder synonyms(List<String> synonyms) {
            this.synonyms = Objects.requireNonNull(synonyms);
            return this;
        }
        public Builder synonyms(String... synonyms) {
            return synonyms(List.of(synonyms));
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public GetSlotTypeEnumerationValue build() {
            return new GetSlotTypeEnumerationValue(synonyms, value);
        }
    }
}
