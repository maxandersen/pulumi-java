// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.azurenative.storage.outputs.EncryptionServiceResponse;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EncryptionServicesResponse {
    /**
     * The encryption function of the blob storage service.
     * 
     */
    private final @Nullable EncryptionServiceResponse blob;
    /**
     * The encryption function of the file storage service.
     * 
     */
    private final @Nullable EncryptionServiceResponse file;
    /**
     * The encryption function of the queue storage service.
     * 
     */
    private final @Nullable EncryptionServiceResponse queue;
    /**
     * The encryption function of the table storage service.
     * 
     */
    private final @Nullable EncryptionServiceResponse table;

    @CustomType.Constructor
    private EncryptionServicesResponse(
        @CustomType.Parameter("blob") @Nullable EncryptionServiceResponse blob,
        @CustomType.Parameter("file") @Nullable EncryptionServiceResponse file,
        @CustomType.Parameter("queue") @Nullable EncryptionServiceResponse queue,
        @CustomType.Parameter("table") @Nullable EncryptionServiceResponse table) {
        this.blob = blob;
        this.file = file;
        this.queue = queue;
        this.table = table;
    }

    /**
     * The encryption function of the blob storage service.
     * 
    */
    public Optional<EncryptionServiceResponse> blob() {
        return Optional.ofNullable(this.blob);
    }
    /**
     * The encryption function of the file storage service.
     * 
    */
    public Optional<EncryptionServiceResponse> file() {
        return Optional.ofNullable(this.file);
    }
    /**
     * The encryption function of the queue storage service.
     * 
    */
    public Optional<EncryptionServiceResponse> queue() {
        return Optional.ofNullable(this.queue);
    }
    /**
     * The encryption function of the table storage service.
     * 
    */
    public Optional<EncryptionServiceResponse> table() {
        return Optional.ofNullable(this.table);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionServicesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EncryptionServiceResponse blob;
        private @Nullable EncryptionServiceResponse file;
        private @Nullable EncryptionServiceResponse queue;
        private @Nullable EncryptionServiceResponse table;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionServicesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blob = defaults.blob;
    	      this.file = defaults.file;
    	      this.queue = defaults.queue;
    	      this.table = defaults.table;
        }

        public Builder blob(@Nullable EncryptionServiceResponse blob) {
            this.blob = blob;
            return this;
        }
        public Builder file(@Nullable EncryptionServiceResponse file) {
            this.file = file;
            return this;
        }
        public Builder queue(@Nullable EncryptionServiceResponse queue) {
            this.queue = queue;
            return this;
        }
        public Builder table(@Nullable EncryptionServiceResponse table) {
            this.table = table;
            return this;
        }        public EncryptionServicesResponse build() {
            return new EncryptionServicesResponse(blob, file, queue, table);
        }
    }
}
