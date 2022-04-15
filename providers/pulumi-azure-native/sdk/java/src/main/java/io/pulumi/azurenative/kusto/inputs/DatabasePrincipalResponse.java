// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A class representing database principal entity.
 * 
 */
public final class DatabasePrincipalResponse extends io.pulumi.resources.InvokeArgs {

    public static final DatabasePrincipalResponse Empty = new DatabasePrincipalResponse();

    /**
     * Application id - relevant only for application principal type.
     * 
     */
    @Import(name="appId")
      private final @Nullable String appId;

    public Optional<String> appId() {
        return this.appId == null ? Optional.empty() : Optional.ofNullable(this.appId);
    }

    /**
     * Database principal email if exists.
     * 
     */
    @Import(name="email")
      private final @Nullable String email;

    public Optional<String> email() {
        return this.email == null ? Optional.empty() : Optional.ofNullable(this.email);
    }

    /**
     * Database principal fully qualified name.
     * 
     */
    @Import(name="fqn")
      private final @Nullable String fqn;

    public Optional<String> fqn() {
        return this.fqn == null ? Optional.empty() : Optional.ofNullable(this.fqn);
    }

    /**
     * Database principal name.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * Database principal role.
     * 
     */
    @Import(name="role", required=true)
      private final String role;

    public String role() {
        return this.role;
    }

    /**
     * The tenant name of the principal
     * 
     */
    @Import(name="tenantName", required=true)
      private final String tenantName;

    public String tenantName() {
        return this.tenantName;
    }

    /**
     * Database principal type.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public DatabasePrincipalResponse(
        @Nullable String appId,
        @Nullable String email,
        @Nullable String fqn,
        String name,
        String role,
        String tenantName,
        String type) {
        this.appId = appId;
        this.email = email;
        this.fqn = fqn;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
        this.tenantName = Objects.requireNonNull(tenantName, "expected parameter 'tenantName' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private DatabasePrincipalResponse() {
        this.appId = null;
        this.email = null;
        this.fqn = null;
        this.name = null;
        this.role = null;
        this.tenantName = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabasePrincipalResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String appId;
        private @Nullable String email;
        private @Nullable String fqn;
        private String name;
        private String role;
        private String tenantName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabasePrincipalResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.email = defaults.email;
    	      this.fqn = defaults.fqn;
    	      this.name = defaults.name;
    	      this.role = defaults.role;
    	      this.tenantName = defaults.tenantName;
    	      this.type = defaults.type;
        }

        public Builder appId(@Nullable String appId) {
            this.appId = appId;
            return this;
        }
        public Builder email(@Nullable String email) {
            this.email = email;
            return this;
        }
        public Builder fqn(@Nullable String fqn) {
            this.fqn = fqn;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder role(String role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public Builder tenantName(String tenantName) {
            this.tenantName = Objects.requireNonNull(tenantName);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public DatabasePrincipalResponse build() {
            return new DatabasePrincipalResponse(appId, email, fqn, name, role, tenantName, type);
        }
    }
}
