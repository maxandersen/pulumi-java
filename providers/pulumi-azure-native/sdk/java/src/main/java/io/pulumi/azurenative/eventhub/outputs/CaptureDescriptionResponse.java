// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub.outputs;

import io.pulumi.azurenative.eventhub.outputs.DestinationResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CaptureDescriptionResponse {
    /**
     * Properties of Destination where capture will be stored. (Storage Account, Blob Names)
     * 
     */
    private final @Nullable DestinationResponse destination;
    /**
     * A value that indicates whether capture description is enabled.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * Enumerates the possible values for the encoding format of capture description. Note: 'AvroDeflate' will be deprecated in New API Version
     * 
     */
    private final @Nullable String encoding;
    /**
     * The time window allows you to set the frequency with which the capture to Azure Blobs will happen, value should between 60 to 900 seconds
     * 
     */
    private final @Nullable Integer intervalInSeconds;
    /**
     * The size window defines the amount of data built up in your Event Hub before an capture operation, value should be between 10485760 to 524288000 bytes
     * 
     */
    private final @Nullable Integer sizeLimitInBytes;
    /**
     * A value that indicates whether to Skip Empty Archives
     * 
     */
    private final @Nullable Boolean skipEmptyArchives;

    @CustomType.Constructor
    private CaptureDescriptionResponse(
        @CustomType.Parameter("destination") @Nullable DestinationResponse destination,
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("encoding") @Nullable String encoding,
        @CustomType.Parameter("intervalInSeconds") @Nullable Integer intervalInSeconds,
        @CustomType.Parameter("sizeLimitInBytes") @Nullable Integer sizeLimitInBytes,
        @CustomType.Parameter("skipEmptyArchives") @Nullable Boolean skipEmptyArchives) {
        this.destination = destination;
        this.enabled = enabled;
        this.encoding = encoding;
        this.intervalInSeconds = intervalInSeconds;
        this.sizeLimitInBytes = sizeLimitInBytes;
        this.skipEmptyArchives = skipEmptyArchives;
    }

    /**
     * Properties of Destination where capture will be stored. (Storage Account, Blob Names)
     * 
    */
    public Optional<DestinationResponse> destination() {
        return Optional.ofNullable(this.destination);
    }
    /**
     * A value that indicates whether capture description is enabled.
     * 
    */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * Enumerates the possible values for the encoding format of capture description. Note: 'AvroDeflate' will be deprecated in New API Version
     * 
    */
    public Optional<String> encoding() {
        return Optional.ofNullable(this.encoding);
    }
    /**
     * The time window allows you to set the frequency with which the capture to Azure Blobs will happen, value should between 60 to 900 seconds
     * 
    */
    public Optional<Integer> intervalInSeconds() {
        return Optional.ofNullable(this.intervalInSeconds);
    }
    /**
     * The size window defines the amount of data built up in your Event Hub before an capture operation, value should be between 10485760 to 524288000 bytes
     * 
    */
    public Optional<Integer> sizeLimitInBytes() {
        return Optional.ofNullable(this.sizeLimitInBytes);
    }
    /**
     * A value that indicates whether to Skip Empty Archives
     * 
    */
    public Optional<Boolean> skipEmptyArchives() {
        return Optional.ofNullable(this.skipEmptyArchives);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CaptureDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DestinationResponse destination;
        private @Nullable Boolean enabled;
        private @Nullable String encoding;
        private @Nullable Integer intervalInSeconds;
        private @Nullable Integer sizeLimitInBytes;
        private @Nullable Boolean skipEmptyArchives;

        public Builder() {
    	      // Empty
        }

        public Builder(CaptureDescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.enabled = defaults.enabled;
    	      this.encoding = defaults.encoding;
    	      this.intervalInSeconds = defaults.intervalInSeconds;
    	      this.sizeLimitInBytes = defaults.sizeLimitInBytes;
    	      this.skipEmptyArchives = defaults.skipEmptyArchives;
        }

        public Builder destination(@Nullable DestinationResponse destination) {
            this.destination = destination;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder encoding(@Nullable String encoding) {
            this.encoding = encoding;
            return this;
        }
        public Builder intervalInSeconds(@Nullable Integer intervalInSeconds) {
            this.intervalInSeconds = intervalInSeconds;
            return this;
        }
        public Builder sizeLimitInBytes(@Nullable Integer sizeLimitInBytes) {
            this.sizeLimitInBytes = sizeLimitInBytes;
            return this;
        }
        public Builder skipEmptyArchives(@Nullable Boolean skipEmptyArchives) {
            this.skipEmptyArchives = skipEmptyArchives;
            return this;
        }        public CaptureDescriptionResponse build() {
            return new CaptureDescriptionResponse(destination, enabled, encoding, intervalInSeconds, sizeLimitInBytes, skipEmptyArchives);
        }
    }
}
