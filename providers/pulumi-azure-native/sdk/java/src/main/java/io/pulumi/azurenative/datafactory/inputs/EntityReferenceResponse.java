// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The entity reference.
 * 
 */
public final class EntityReferenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final EntityReferenceResponse Empty = new EntityReferenceResponse();

    /**
     * The name of this referenced entity.
     * 
     */
    @Import(name="referenceName")
      private final @Nullable String referenceName;

    public Optional<String> referenceName() {
        return this.referenceName == null ? Optional.empty() : Optional.ofNullable(this.referenceName);
    }

    /**
     * The type of this referenced entity.
     * 
     */
    @Import(name="type")
      private final @Nullable String type;

    public Optional<String> type() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public EntityReferenceResponse(
        @Nullable String referenceName,
        @Nullable String type) {
        this.referenceName = referenceName;
        this.type = type;
    }

    private EntityReferenceResponse() {
        this.referenceName = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntityReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String referenceName;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(EntityReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.referenceName = defaults.referenceName;
    	      this.type = defaults.type;
        }

        public Builder referenceName(@Nullable String referenceName) {
            this.referenceName = referenceName;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public EntityReferenceResponse build() {
            return new EntityReferenceResponse(referenceName, type);
        }
    }
}
