// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Additional information of the DPMContainer.
 * 
 */
public final class DPMContainerExtendedInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final DPMContainerExtendedInfoResponse Empty = new DPMContainerExtendedInfoResponse();

    /**
     * Last refresh time of the DPMContainer.
     * 
     */
    @Import(name="lastRefreshedAt")
    private @Nullable String lastRefreshedAt;

    public Optional<String> lastRefreshedAt() {
        return Optional.ofNullable(this.lastRefreshedAt);
    }

    private DPMContainerExtendedInfoResponse() {}

    private DPMContainerExtendedInfoResponse(DPMContainerExtendedInfoResponse $) {
        this.lastRefreshedAt = $.lastRefreshedAt;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DPMContainerExtendedInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DPMContainerExtendedInfoResponse $;

        public Builder() {
            $ = new DPMContainerExtendedInfoResponse();
        }

        public Builder(DPMContainerExtendedInfoResponse defaults) {
            $ = new DPMContainerExtendedInfoResponse(Objects.requireNonNull(defaults));
        }

        public Builder lastRefreshedAt(@Nullable String lastRefreshedAt) {
            $.lastRefreshedAt = lastRefreshedAt;
            return this;
        }

        public DPMContainerExtendedInfoResponse build() {
            return $;
        }
    }

}
