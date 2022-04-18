// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SharingProfileGroupResponse {
    /**
     * A list of subscription/tenant ids the gallery is aimed to be shared to.
     * 
     */
    private final @Nullable List<String> ids;
    /**
     * This property allows you to specify the type of sharing group. <br><br> Possible values are: <br><br> **Subscriptions** <br><br> **AADTenants**
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private SharingProfileGroupResponse(
        @CustomType.Parameter("ids") @Nullable List<String> ids,
        @CustomType.Parameter("type") @Nullable String type) {
        this.ids = ids;
        this.type = type;
    }

    /**
     * A list of subscription/tenant ids the gallery is aimed to be shared to.
     * 
    */
    public List<String> ids() {
        return this.ids == null ? List.of() : this.ids;
    }
    /**
     * This property allows you to specify the type of sharing group. <br><br> Possible values are: <br><br> **Subscriptions** <br><br> **AADTenants**
     * 
    */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SharingProfileGroupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> ids;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SharingProfileGroupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ids = defaults.ids;
    	      this.type = defaults.type;
        }

        public Builder ids(@Nullable List<String> ids) {
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public SharingProfileGroupResponse build() {
            return new SharingProfileGroupResponse(ids, type);
        }
    }
}
