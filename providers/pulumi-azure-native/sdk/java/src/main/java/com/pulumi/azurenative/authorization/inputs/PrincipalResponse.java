// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.authorization.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The name of the entity last modified it
 * 
 */
public final class PrincipalResponse extends com.pulumi.resources.InvokeArgs {

    public static final PrincipalResponse Empty = new PrincipalResponse();

    /**
     * The name of the principal made changes
     * 
     */
    @Import(name="displayName")
      private final @Nullable String displayName;

    public Optional<String> displayName() {
        return this.displayName == null ? Optional.empty() : Optional.ofNullable(this.displayName);
    }

    /**
     * Email of principal
     * 
     */
    @Import(name="email")
      private final @Nullable String email;

    public Optional<String> email() {
        return this.email == null ? Optional.empty() : Optional.ofNullable(this.email);
    }

    /**
     * The id of the principal made changes
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> id() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Type of principal such as user , group etc
     * 
     */
    @Import(name="type")
      private final @Nullable String type;

    public Optional<String> type() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public PrincipalResponse(
        @Nullable String displayName,
        @Nullable String email,
        @Nullable String id,
        @Nullable String type) {
        this.displayName = displayName;
        this.email = email;
        this.id = id;
        this.type = type;
    }

    private PrincipalResponse() {
        this.displayName = null;
        this.email = null;
        this.id = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrincipalResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String displayName;
        private @Nullable String email;
        private @Nullable String id;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(PrincipalResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.email = defaults.email;
    	      this.id = defaults.id;
    	      this.type = defaults.type;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder email(@Nullable String email) {
            this.email = email;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public PrincipalResponse build() {
            return new PrincipalResponse(displayName, email, id, type);
        }
    }
}
