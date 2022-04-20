// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lakeformation.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataLakeSettingsCreateTableDefaultPermission {
    /**
     * List of permissions that are granted to the principal. Valid values may include `ALL`, `SELECT`, `ALTER`, `DROP`, `DELETE`, `INSERT`, and `DESCRIBE`. For more details, see [Lake Formation Permissions Reference](https://docs.aws.amazon.com/lake-formation/latest/dg/lf-permissions-reference.html).
     * 
     */
    private final @Nullable List<String> permissions;
    /**
     * Principal who is granted permissions. To enforce metadata and underlying data access control only by IAM on new databases and tables set `principal` to `IAM_ALLOWED_PRINCIPALS` and `permissions` to `[&#34;ALL&#34;]`.
     * 
     */
    private final @Nullable String principal;

    @CustomType.Constructor
    private DataLakeSettingsCreateTableDefaultPermission(
        @CustomType.Parameter("permissions") @Nullable List<String> permissions,
        @CustomType.Parameter("principal") @Nullable String principal) {
        this.permissions = permissions;
        this.principal = principal;
    }

    /**
     * List of permissions that are granted to the principal. Valid values may include `ALL`, `SELECT`, `ALTER`, `DROP`, `DELETE`, `INSERT`, and `DESCRIBE`. For more details, see [Lake Formation Permissions Reference](https://docs.aws.amazon.com/lake-formation/latest/dg/lf-permissions-reference.html).
     * 
    */
    public List<String> permissions() {
        return this.permissions == null ? List.of() : this.permissions;
    }
    /**
     * Principal who is granted permissions. To enforce metadata and underlying data access control only by IAM on new databases and tables set `principal` to `IAM_ALLOWED_PRINCIPALS` and `permissions` to `[&#34;ALL&#34;]`.
     * 
    */
    public Optional<String> principal() {
        return Optional.ofNullable(this.principal);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataLakeSettingsCreateTableDefaultPermission defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> permissions;
        private @Nullable String principal;

        public Builder() {
    	      // Empty
        }

        public Builder(DataLakeSettingsCreateTableDefaultPermission defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.permissions = defaults.permissions;
    	      this.principal = defaults.principal;
        }

        public Builder permissions(@Nullable List<String> permissions) {
            this.permissions = permissions;
            return this;
        }
        public Builder permissions(String... permissions) {
            return permissions(List.of(permissions));
        }
        public Builder principal(@Nullable String principal) {
            this.principal = principal;
            return this;
        }        public DataLakeSettingsCreateTableDefaultPermission build() {
            return new DataLakeSettingsCreateTableDefaultPermission(permissions, principal);
        }
    }
}
