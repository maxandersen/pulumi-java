// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbformysql.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGetPrivateDnsZoneSuffixExecuteResult {
    /**
     * Represents the private DNS zone suffix.
     * 
     */
    private final @Nullable String privateDnsZoneSuffix;

    @CustomType.Constructor
    private GetGetPrivateDnsZoneSuffixExecuteResult(@CustomType.Parameter("privateDnsZoneSuffix") @Nullable String privateDnsZoneSuffix) {
        this.privateDnsZoneSuffix = privateDnsZoneSuffix;
    }

    /**
     * Represents the private DNS zone suffix.
     * 
    */
    public Optional<String> privateDnsZoneSuffix() {
        return Optional.ofNullable(this.privateDnsZoneSuffix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGetPrivateDnsZoneSuffixExecuteResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String privateDnsZoneSuffix;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGetPrivateDnsZoneSuffixExecuteResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateDnsZoneSuffix = defaults.privateDnsZoneSuffix;
        }

        public Builder privateDnsZoneSuffix(@Nullable String privateDnsZoneSuffix) {
            this.privateDnsZoneSuffix = privateDnsZoneSuffix;
            return this;
        }        public GetGetPrivateDnsZoneSuffixExecuteResult build() {
            return new GetGetPrivateDnsZoneSuffixExecuteResult(privateDnsZoneSuffix);
        }
    }
}
