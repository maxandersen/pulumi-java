// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigqueryreservation_v1beta1;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.bigqueryreservation_v1beta1.inputs.GetCapacityCommitmentArgs;
import com.pulumi.googlenative.bigqueryreservation_v1beta1.inputs.GetReservationArgs;
import com.pulumi.googlenative.bigqueryreservation_v1beta1.outputs.GetCapacityCommitmentResult;
import com.pulumi.googlenative.bigqueryreservation_v1beta1.outputs.GetReservationResult;
import java.util.concurrent.CompletableFuture;

public final class Bigqueryreservation_v1beta1Functions {
    /**
     * Returns information about the capacity commitment.
     * 
     */
    public static CompletableFuture<GetCapacityCommitmentResult> getCapacityCommitment(GetCapacityCommitmentArgs args) {
        return getCapacityCommitment(args, InvokeOptions.Empty);
    }
    /**
     * Returns information about the capacity commitment.
     * 
     */
    public static CompletableFuture<GetCapacityCommitmentResult> getCapacityCommitment(GetCapacityCommitmentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:bigqueryreservation/v1beta1:getCapacityCommitment", TypeShape.of(GetCapacityCommitmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Returns information about the reservation.
     * 
     */
    public static CompletableFuture<GetReservationResult> getReservation(GetReservationArgs args) {
        return getReservation(args, InvokeOptions.Empty);
    }
    /**
     * Returns information about the reservation.
     * 
     */
    public static CompletableFuture<GetReservationResult> getReservation(GetReservationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:bigqueryreservation/v1beta1:getReservation", TypeShape.of(GetReservationResult.class), args, Utilities.withVersion(options));
    }
}
