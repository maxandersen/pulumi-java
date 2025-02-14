// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kusto.outputs;

import com.pulumi.azurenative.kusto.outputs.DatabasePrincipalResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ListDatabasePrincipalsResult {
    /**
     * @return The list of Kusto database principals.
     * 
     */
    private final @Nullable List<DatabasePrincipalResponse> value;

    @CustomType.Constructor
    private ListDatabasePrincipalsResult(@CustomType.Parameter("value") @Nullable List<DatabasePrincipalResponse> value) {
        this.value = value;
    }

    /**
     * @return The list of Kusto database principals.
     * 
     */
    public List<DatabasePrincipalResponse> value() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListDatabasePrincipalsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DatabasePrincipalResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListDatabasePrincipalsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder value(@Nullable List<DatabasePrincipalResponse> value) {
            this.value = value;
            return this;
        }
        public Builder value(DatabasePrincipalResponse... value) {
            return value(List.of(value));
        }        public ListDatabasePrincipalsResult build() {
            return new ListDatabasePrincipalsResult(value);
        }
    }
}
