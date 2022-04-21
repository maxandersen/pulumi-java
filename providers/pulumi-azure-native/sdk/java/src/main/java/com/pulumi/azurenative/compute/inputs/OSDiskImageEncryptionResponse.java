// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains encryption settings for an OS disk image.
 * 
 */
public final class OSDiskImageEncryptionResponse extends com.pulumi.resources.InvokeArgs {

    public static final OSDiskImageEncryptionResponse Empty = new OSDiskImageEncryptionResponse();

    /**
     * A relative URI containing the resource ID of the disk encryption set.
     * 
     */
    @Import(name="diskEncryptionSetId")
    private @Nullable String diskEncryptionSetId;

    public Optional<String> diskEncryptionSetId() {
        return Optional.ofNullable(this.diskEncryptionSetId);
    }

    private OSDiskImageEncryptionResponse() {}

    private OSDiskImageEncryptionResponse(OSDiskImageEncryptionResponse $) {
        this.diskEncryptionSetId = $.diskEncryptionSetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OSDiskImageEncryptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OSDiskImageEncryptionResponse $;

        public Builder() {
            $ = new OSDiskImageEncryptionResponse();
        }

        public Builder(OSDiskImageEncryptionResponse defaults) {
            $ = new OSDiskImageEncryptionResponse(Objects.requireNonNull(defaults));
        }

        public Builder diskEncryptionSetId(@Nullable String diskEncryptionSetId) {
            $.diskEncryptionSetId = diskEncryptionSetId;
            return this;
        }

        public OSDiskImageEncryptionResponse build() {
            return $;
        }
    }

}
