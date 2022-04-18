// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.engagementfabric.outputs;

import com.pulumi.azurenative.engagementfabric.outputs.KeyDescriptionResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ListAccountKeysResult {
    /**
     * Account keys
     * 
     */
    private final List<KeyDescriptionResponse> value;

    @CustomType.Constructor
    private ListAccountKeysResult(@CustomType.Parameter("value") List<KeyDescriptionResponse> value) {
        this.value = value;
    }

    /**
     * Account keys
     * 
    */
    public List<KeyDescriptionResponse> value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListAccountKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<KeyDescriptionResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListAccountKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder value(List<KeyDescriptionResponse> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder value(KeyDescriptionResponse... value) {
            return value(List.of(value));
        }        public ListAccountKeysResult build() {
            return new ListAccountKeysResult(value);
        }
    }
}
