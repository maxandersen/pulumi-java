// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketV2Grant {
    /**
     * @return Canonical user id to grant for. Used only when `type` is `CanonicalUser`.
     * 
     */
    private final @Nullable String id;
    /**
     * @return List of permissions to apply for grantee. Valid values are `READ`, `WRITE`, `READ_ACP`, `WRITE_ACP`, `FULL_CONTROL`.
     * 
     */
    private final List<String> permissions;
    /**
     * @return Type of grantee to apply for. Valid values are `CanonicalUser` and `Group`. `AmazonCustomerByEmail` is not supported.
     * 
     */
    private final String type;
    /**
     * @return Uri address to grant for. Used only when `type` is `Group`.
     * 
     */
    private final @Nullable String uri;

    @CustomType.Constructor
    private BucketV2Grant(
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("permissions") List<String> permissions,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("uri") @Nullable String uri) {
        this.id = id;
        this.permissions = permissions;
        this.type = type;
        this.uri = uri;
    }

    /**
     * @return Canonical user id to grant for. Used only when `type` is `CanonicalUser`.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return List of permissions to apply for grantee. Valid values are `READ`, `WRITE`, `READ_ACP`, `WRITE_ACP`, `FULL_CONTROL`.
     * 
     */
    public List<String> permissions() {
        return this.permissions;
    }
    /**
     * @return Type of grantee to apply for. Valid values are `CanonicalUser` and `Group`. `AmazonCustomerByEmail` is not supported.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Uri address to grant for. Used only when `type` is `Group`.
     * 
     */
    public Optional<String> uri() {
        return Optional.ofNullable(this.uri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketV2Grant defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private List<String> permissions;
        private String type;
        private @Nullable String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketV2Grant defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.permissions = defaults.permissions;
    	      this.type = defaults.type;
    	      this.uri = defaults.uri;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder permissions(List<String> permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }
        public Builder permissions(String... permissions) {
            return permissions(List.of(permissions));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder uri(@Nullable String uri) {
            this.uri = uri;
            return this;
        }        public BucketV2Grant build() {
            return new BucketV2Grant(id, permissions, type, uri);
        }
    }
}
