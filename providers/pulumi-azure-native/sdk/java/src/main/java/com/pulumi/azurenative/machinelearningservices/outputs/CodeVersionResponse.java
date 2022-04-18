// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CodeVersionResponse {
    /**
     * ARM resource ID of the datastore where the asset is located.
     * 
     */
    private final @Nullable String datastoreId;
    /**
     * The asset description text.
     * 
     */
    private final @Nullable String description;
    /**
     * If the name version are system generated (anonymous registration).
     * 
     */
    private final @Nullable Boolean isAnonymous;
    /**
     * The path of the file/directory in the datastore.
     * 
     */
    private final String path;
    /**
     * The asset property dictionary.
     * 
     */
    private final @Nullable Map<String,String> properties;
    /**
     * Tag dictionary. Tags can be added, removed, and updated.
     * 
     */
    private final @Nullable Map<String,String> tags;

    @CustomType.Constructor
    private CodeVersionResponse(
        @CustomType.Parameter("datastoreId") @Nullable String datastoreId,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("isAnonymous") @Nullable Boolean isAnonymous,
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("properties") @Nullable Map<String,String> properties,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags) {
        this.datastoreId = datastoreId;
        this.description = description;
        this.isAnonymous = isAnonymous;
        this.path = path;
        this.properties = properties;
        this.tags = tags;
    }

    /**
     * ARM resource ID of the datastore where the asset is located.
     * 
    */
    public Optional<String> datastoreId() {
        return Optional.ofNullable(this.datastoreId);
    }
    /**
     * The asset description text.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * If the name version are system generated (anonymous registration).
     * 
    */
    public Optional<Boolean> isAnonymous() {
        return Optional.ofNullable(this.isAnonymous);
    }
    /**
     * The path of the file/directory in the datastore.
     * 
    */
    public String path() {
        return this.path;
    }
    /**
     * The asset property dictionary.
     * 
    */
    public Map<String,String> properties() {
        return this.properties == null ? Map.of() : this.properties;
    }
    /**
     * Tag dictionary. Tags can be added, removed, and updated.
     * 
    */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CodeVersionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String datastoreId;
        private @Nullable String description;
        private @Nullable Boolean isAnonymous;
        private String path;
        private @Nullable Map<String,String> properties;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(CodeVersionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datastoreId = defaults.datastoreId;
    	      this.description = defaults.description;
    	      this.isAnonymous = defaults.isAnonymous;
    	      this.path = defaults.path;
    	      this.properties = defaults.properties;
    	      this.tags = defaults.tags;
        }

        public Builder datastoreId(@Nullable String datastoreId) {
            this.datastoreId = datastoreId;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder isAnonymous(@Nullable Boolean isAnonymous) {
            this.isAnonymous = isAnonymous;
            return this;
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }        public CodeVersionResponse build() {
            return new CodeVersionResponse(datastoreId, description, isAnonymous, path, properties, tags);
        }
    }
}
