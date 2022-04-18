// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.privateca_v1.outputs.ExtendedKeyUsageOptionsResponse;
import com.pulumi.googlenative.privateca_v1.outputs.KeyUsageOptionsResponse;
import com.pulumi.googlenative.privateca_v1.outputs.ObjectIdResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class KeyUsageResponse {
    /**
     * Describes high-level ways in which a key may be used.
     * 
     */
    private final KeyUsageOptionsResponse baseKeyUsage;
    /**
     * Detailed scenarios in which a key may be used.
     * 
     */
    private final ExtendedKeyUsageOptionsResponse extendedKeyUsage;
    /**
     * Used to describe extended key usages that are not listed in the KeyUsage.ExtendedKeyUsageOptions message.
     * 
     */
    private final List<ObjectIdResponse> unknownExtendedKeyUsages;

    @CustomType.Constructor
    private KeyUsageResponse(
        @CustomType.Parameter("baseKeyUsage") KeyUsageOptionsResponse baseKeyUsage,
        @CustomType.Parameter("extendedKeyUsage") ExtendedKeyUsageOptionsResponse extendedKeyUsage,
        @CustomType.Parameter("unknownExtendedKeyUsages") List<ObjectIdResponse> unknownExtendedKeyUsages) {
        this.baseKeyUsage = baseKeyUsage;
        this.extendedKeyUsage = extendedKeyUsage;
        this.unknownExtendedKeyUsages = unknownExtendedKeyUsages;
    }

    /**
     * Describes high-level ways in which a key may be used.
     * 
    */
    public KeyUsageOptionsResponse baseKeyUsage() {
        return this.baseKeyUsage;
    }
    /**
     * Detailed scenarios in which a key may be used.
     * 
    */
    public ExtendedKeyUsageOptionsResponse extendedKeyUsage() {
        return this.extendedKeyUsage;
    }
    /**
     * Used to describe extended key usages that are not listed in the KeyUsage.ExtendedKeyUsageOptions message.
     * 
    */
    public List<ObjectIdResponse> unknownExtendedKeyUsages() {
        return this.unknownExtendedKeyUsages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyUsageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeyUsageOptionsResponse baseKeyUsage;
        private ExtendedKeyUsageOptionsResponse extendedKeyUsage;
        private List<ObjectIdResponse> unknownExtendedKeyUsages;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyUsageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseKeyUsage = defaults.baseKeyUsage;
    	      this.extendedKeyUsage = defaults.extendedKeyUsage;
    	      this.unknownExtendedKeyUsages = defaults.unknownExtendedKeyUsages;
        }

        public Builder baseKeyUsage(KeyUsageOptionsResponse baseKeyUsage) {
            this.baseKeyUsage = Objects.requireNonNull(baseKeyUsage);
            return this;
        }
        public Builder extendedKeyUsage(ExtendedKeyUsageOptionsResponse extendedKeyUsage) {
            this.extendedKeyUsage = Objects.requireNonNull(extendedKeyUsage);
            return this;
        }
        public Builder unknownExtendedKeyUsages(List<ObjectIdResponse> unknownExtendedKeyUsages) {
            this.unknownExtendedKeyUsages = Objects.requireNonNull(unknownExtendedKeyUsages);
            return this;
        }
        public Builder unknownExtendedKeyUsages(ObjectIdResponse... unknownExtendedKeyUsages) {
            return unknownExtendedKeyUsages(List.of(unknownExtendedKeyUsages));
        }        public KeyUsageResponse build() {
            return new KeyUsageResponse(baseKeyUsage, extendedKeyUsage, unknownExtendedKeyUsages);
        }
    }
}
