// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The properties of a storage account for a container registry. Only applicable to Classic SKU.
 * 
 */
public final class StorageAccountPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final StorageAccountPropertiesResponse Empty = new StorageAccountPropertiesResponse();

    /**
     * The resource ID of the storage account.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    public String id() {
        return this.id;
    }

    private StorageAccountPropertiesResponse() {}

    private StorageAccountPropertiesResponse(StorageAccountPropertiesResponse $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StorageAccountPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageAccountPropertiesResponse $;

        public Builder() {
            $ = new StorageAccountPropertiesResponse();
        }

        public Builder(StorageAccountPropertiesResponse defaults) {
            $ = new StorageAccountPropertiesResponse(Objects.requireNonNull(defaults));
        }

        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public StorageAccountPropertiesResponse build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
