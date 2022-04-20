// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core_v1.outputs.KeyToPath;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SecretProjection {
    /**
     * If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the &#39;..&#39; path or start with &#39;..&#39;.
     * 
     */
    private final @Nullable List<KeyToPath> items;
    /**
     * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     * 
     */
    private final @Nullable String name;
    /**
     * Specify whether the Secret or its key must be defined
     * 
     */
    private final @Nullable Boolean optional;

    @CustomType.Constructor
    private SecretProjection(
        @CustomType.Parameter("items") @Nullable List<KeyToPath> items,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("optional") @Nullable Boolean optional) {
        this.items = items;
        this.name = name;
        this.optional = optional;
    }

    /**
     * If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the &#39;..&#39; path or start with &#39;..&#39;.
     * 
    */
    public List<KeyToPath> items() {
        return this.items == null ? List.of() : this.items;
    }
    /**
     * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Specify whether the Secret or its key must be defined
     * 
    */
    public Optional<Boolean> optional() {
        return Optional.ofNullable(this.optional);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretProjection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<KeyToPath> items;
        private @Nullable String name;
        private @Nullable Boolean optional;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretProjection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
    	      this.name = defaults.name;
    	      this.optional = defaults.optional;
        }

        public Builder items(@Nullable List<KeyToPath> items) {
            this.items = items;
            return this;
        }
        public Builder items(KeyToPath... items) {
            return items(List.of(items));
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder optional(@Nullable Boolean optional) {
            this.optional = optional;
            return this;
        }        public SecretProjection build() {
            return new SecretProjection(items, name, optional);
        }
    }
}
