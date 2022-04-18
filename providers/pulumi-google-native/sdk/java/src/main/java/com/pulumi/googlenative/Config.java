// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative;

import com.pulumi.core.TypeShape;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;

public final class Config {

    private static final com.pulumi.Config config = com.pulumi.Config.of("google-native");
/**
 * Additional user-agent string to append to the default one (<prod_name>/<ver>).
 * 
 */
    public Optional<String> appendUserAgent() {
        return config.getObject("appendUserAgent",TypeShape.<String>builder(String.class).build());
    }
/**
 * This will disable the Pulumi Partner Name which is used if a custom `partnerName` isn't specified.
 * 
 */
    public Optional<Boolean> disablePartnerName() {
        return config.getObject("disablePartnerName",TypeShape.<Boolean>builder(Boolean.class).build());
    }
/**
 * A Google Partner Name to facilitate partner resource usage attribution.
 * 
 */
    public Optional<String> partnerName() {
        return config.getObject("partnerName",TypeShape.<String>builder(String.class).build());
    }
/**
 * The default project to manage resources in. If another project is specified on a resource, it will take precedence.
 * 
 */
    public Optional<String> project() {
        return config.getObject("project",TypeShape.<String>builder(String.class).build());
    }
/**
 * The default region to manage resources in. If another region is specified on a regional resource, it will take precedence.
 * 
 */
    public Optional<String> region() {
        return config.getObject("region",TypeShape.<String>builder(String.class).build());
    }
/**
 * The default zone to manage resources in. Generally, this zone should be within the default region you specified. If another zone is specified on a zonal resource, it will take precedence.
 * 
 */
    public Optional<String> zone() {
        return config.getObject("zone",TypeShape.<String>builder(String.class).build());
    }
}
